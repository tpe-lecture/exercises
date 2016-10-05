package tpe.io.console;

/**
 * Liest einen Text von der Console und
 * schreibt ihn dann in eine Datei. Allerdings
 * erfolgt das Schreiben über eine Ausgabeumleitung
 * und nicht über Dateioperationen.
 */
public class ConsoleToFile {

    /** Logfile für Ausgaben. */
    private static final String LOGFILE = "output/console.log";

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeile-Argumente.
     */
    public static void main(String[] args) {
        // TODO: Von Konsole zeilenweise lesen
        // TODO: Akutelle Anzahl der Zeilen auf System.err ausgeben
        // TODO: System.out in die Datei `LOGFILE` umleiten
    }
}
