/* (c) 2016 Thomas Smits */
package tpe.exceptions.test;

/**
 * Implementierung einer Caesar-Verschlüsselung.
 *
 * Der Eingabetext ({@literal message}) darf nur aus den Groß-Buchstaben A-Z
 * bestehen. Alle anderen Zeichen (einschließlich der Leerzeichen) führen zu
 * einer entsprechenden Ausnahme.
 *
 * Dasselbe gilt für die Entschlüsselung. Auch hier dürfen nur gültige
 * Zeichen auftauchen. Andernfalls kommt es zu einer Ausnahme.
 *
 * Der Schlüssel darf nur aus einem einzelnen Zeichen bestehen und muss
 * ebenfalls aus dem Bereich A-Z stammen. Kleinbuchstaben oder andere
 * Zeichen führen zu einer Ausnahme.
 *
 * Zwischen den beiden Methoden muss bei gleichem Schlüssel {@code key}
 * folgendes gelten:
 *
 * {@code text.equals(decrypt(key, encrypt(key, text)) == true}.
 *

 *
 * @author Thomas Smits
 */
public class CrypterCaesar {

    /** Gültige Zeichen für Schlüssel und Text. */
    protected static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * Verschlüsselt den gegebenen Text mit dem angegebenen Schlüssel.
     *
     * @param key Schlüssel, der verwendet werden soll.
     * @param message Nachricht, die Verschlüsselt werden soll.
     *
     * @return verschlüsselter Text.
     * @throws IllegalMessageException Wird geworfen, wenn die
     *          Nachricht ungültig ist.
     * @throws IllegalKeyException Wird geworfen, wenn der Schlüssel
     *          ungültig ist.
     */
    public String encrypt(String key, String message)
            throws IllegalMessageException, IllegalKeyException {

        checkKeyAndMessage(key, message);

        int shift = key.charAt(0) - 'A' + 1;
        return shift(message, shift);
    }

    /**
     * Entschlüsselt den gegebenen Text mit dem angegebenen Schlüssel.
     *
     * @param key Schlüssel, der verwendet werden soll.
     * @param cypherText Nachricht, die entschlüsselt werden soll.
     *
     * @return entschlüsselter Text.
     * @throws IllegalMessageException Wird geworfen, wenn die
     *          Nachricht ungültig ist.
     * @throws IllegalKeyException Wird geworfen, wenn der Schlüssel
     *          ungültig ist.
     */
    public String decrypt(String key, String cypherText)
            throws IllegalKeyException, IllegalMessageException {

        checkKeyAndMessage(key, cypherText);

        int shift = key.charAt(0) - 'A' + 1;
        return shift(cypherText, -shift);
    }

    /**
     * Verschiebt die Zeichen im Text um den gegebenen Faktor.
     *
     * @param text Nachricht
     * @param shift Verschiebefaktor
     * @return das Ergebnis als String
     */
    private String shift(String text, int shift) {

        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            char newChar = (char) (c + shift);

            if (newChar > 'Z') {
                // Überlauf nach hinten
                newChar = (char) (newChar - ('Z' - 'A' + 1));
            }
            else if (newChar < 'A') {
                // Überlauf nach vorne
                newChar = (char) (newChar + ('Z' - 'A' + 1));
            }

            result.append(newChar);
        }

        return result.toString();
    }

    /**
     * Prüft Schlüssel und Nachricht.
     *
     * @param key der Schlüssel
     * @param message die Nachricht
     * @throws IllegalKeyException Schlüssel nicht OK
     * @throws IllegalMessageException Nachricht nicht OK
     */
    private void checkKeyAndMessage(String key, String message)
            throws IllegalKeyException, IllegalMessageException {

        if (!checkKey(key)) {
            throw new IllegalKeyException(key);
        }

        if (!checkCharacters(message, ALPHABET)) {
            throw new IllegalMessageException(key);
        }
    }

    /**
     * Testet den Schlüssel auf Korrektheit: Er muss mindestens die Länge 1
     * haben und darf nur Zeichen von A-Z enthalten.
     *
     * @param key zu testender Schlüssel
     * @return {@code true} if characters are ok, otherwise {@code false}
     */
    protected boolean checkKey(String key) {

        if (key.length() != 1) {
            return false;
        }

        return checkCharacters(key, ALPHABET);
    }

    /**
     * Checks the given input to ensure that it only contains the given
     * character set and no other characters.
     *
     * @param inputChars the string to be checked
     * @param charSet a string containing all allowed characters
     * @return {@code true} if characters are ok, otherwise {@code false}
     */
    protected boolean checkCharacters(char[] inputChars, String charSet) {

        for (char c : inputChars) {
            if (charSet.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks the given input to ensure that it only contains the given
     * character set and no other characters.
     *
     * @param input the string to be checked
     * @param charSet a string containing all allowed characters
     * @return {@code true} if characters are ok, otherwise {@code false}
     */
    protected boolean checkCharacters(String input, String charSet) {
        return checkCharacters(input.toCharArray(), charSet);
    }
}

