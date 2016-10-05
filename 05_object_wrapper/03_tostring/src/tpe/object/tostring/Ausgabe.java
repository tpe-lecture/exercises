package tpe.object.tostring;

/**
 * Ausgabe.
 */
public final class Ausgabe {

    /**
     * Konstruktor.
     */
    private Ausgabe() {
        // keine Objekte.
    }

    /**
     * Einstiegspunkt in das Programm.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {
        Alien alien = new Alien("E.T.", new Raumanzug("Spaceman 2000"));
        System.out.println(alien);
    }
}
