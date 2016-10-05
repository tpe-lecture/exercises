package tpe.io.file;

import java.io.File;
import java.io.IOException;

/**
 * Klasse, die das Datesystem durchläuft und Informationen ausgibt.
 */
public class FilesystemWalker {

    /**
     * Haupt-Methode.
     *
     * @param args Kommandozeilen-Argumente.
     * @throws IOException IO-Probleme
     */
    public static void main(String[] args) throws IOException {

        String path = args.length > 0 ? args[0] : "../";

        File root = new File(path).getCanonicalFile();

        System.out.println("Untersuche: " + root);
        System.out.println();

        // TODO: Dateisystem rekursiv durchlaufen und Größe berechnen
        long total = 0;

        System.out.println();
        System.out.println("Gesamtgröße: " + niceSize(total));
    }

    // TODO: Methode schreiben, die das Dateisystem ausgehend von einem
    //       Startverzeichnis durchläuft.

    /**
     * Wandelt die Größe in eine schönere Darstellung um.
     *
     * @param size Die Größe.
     * @return Schönere Darstellung.
     */
    private static String niceSize(long size) {

        if (size > 1000_000L) {
            return String.format("%.1f MByte", size / 1024.0 / 1024.0);
        }
        else if (size > 1000L) {
            return String.format("%.1f kByte", size / 1024.0);
        }
        else {
            return String.format("%d Byte", size);
        }
    }
}
