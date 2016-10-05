package tpe.collections.set;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Klassen, um die in einem Text vorkommenen Wörter zu sammeln.
 */
public class WordCollector {

    /**
     * Listet alle Worte in der Datei alphabetisch auf. Duplikate werden
     * entfernt. Die Wörter werden in Kleinbuchstaben umgewandelt.
     *
     * @param filename Dateiname
     * @return die Liste der vorhandenen Wort
     * @throws IOException Fehler beim Dateizugriff.
     */
    public static String[] listWords(String filename) throws IOException {
        String[] allWords = readFileAndSplitIntoWords(filename);
        String[] result = removeDuplicates(allWords);

        return result;
    }

    /**
     * Listet alle Worte in der Datei auf.
     *
     * @param filename Dateiname
     * @return die Liste der vorhandenen Wort
     * @throws IOException Fehler beim Dateizugriff.
     */
    private static String[] readFileAndSplitIntoWords(String filename)
            throws IOException {

        // Datei zum Lesen öffnen
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line; // aktuelle Zeile
        String[] wordBuffer = new String[100]; // Puffer für die Worte
        int pos = 0; // Position im Word-Puffer

        // Über die Zeilen der Datei iterieren
        while ((line = reader.readLine()) != null) {

            // Sonderzeichen entfernen und die Zeilen in Worte splitten
            line = line.replaceAll("[\",.:'\\-\\!?]", "");

            String[] words = line.toLowerCase().split("[,. ]");

            // Worte in den Puffer übertragen
            for (String word : words) {

                if (pos >= wordBuffer.length) {
                    // Puffer ist voll, vergrößern
                    String[] newBuffer = new String[wordBuffer.length * 2];
                    System.arraycopy(wordBuffer, 0, newBuffer,
                            0, wordBuffer.length);
                    wordBuffer = newBuffer;
                }

                wordBuffer[pos++] = word;
            }
        }

        reader.close();

        // Ergebnis-Array mit der richtigen Größe anlegen
        String[] result = new String[pos];
        System.arraycopy(wordBuffer, 0, result, 0, pos);

        return result;
    }

    /**
     * Sortiert das übergebene Array alphabetisch und entfernt Duplikate.
     *
     * @param input Eingabe Array
     * @return sortiertes und bereinigtes Array
     */
    private static String[] removeDuplicates(String[] input) {

        // Eingabe Array clonen, da es verändert wird (Seiteneffekt)
        String[] strings = input.clone();

        // Array sortieren
        Arrays.sort(strings);

        // Über die Einträge laufen
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];

            if (word == null) {
                // Bereits entfernter Eintrag
                continue;
            }

            // Über die Einträge laufen
            for (int k = i + 1; k < strings.length; k++) {
                String otherWord = strings[k];

                if (otherWord == null) {
                    // Bereits entfernter Eintrag
                    continue;
                }
                else if (otherWord.compareTo(word) > 0) {
                    // Sind schon hinter der möglichen Position
                    break;
                }
                else if (otherWord.equals(word)) {
                    // Duplikat, ausnullen
                    strings[k] = null;
                }
            }
        }

        // Ausgenullte Einträge entfernen
        int pos = 0;
        String[] temp = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                temp[pos++] = strings[i];
            }
        }

        // Ergebnis auf die richtige Länge bringen
        String[] result = new String[pos];
        System.arraycopy(temp, 0, result, 0, pos);

        return result;
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {

        try {
            String[] words = listWords("assets/kafka.txt");
            System.out.println(Arrays.toString(words));
        }
        catch (IOException e) {
            System.err.println("Probleme beim Dateizugriff: " + e);
        }
    }
}
