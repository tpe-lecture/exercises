package tpe.io.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Liest eine Textdatei und gibt den Inhalt auf der Konsole aus.
 */
public class LineNumberPrinter {

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {

        String filename = args.length == 1 ? args[0] : "assets/kafka.txt";

        // TODO: Datei lesen und mit Zeilennummern wieder ausgeben
    }
}
