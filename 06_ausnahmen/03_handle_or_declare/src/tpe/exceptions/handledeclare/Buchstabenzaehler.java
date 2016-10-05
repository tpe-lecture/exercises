package tpe.exceptions.handledeclare;

//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;

/**
 * Anwendung, die die Buchstabenhäufigkeit in einem Text analysiert.
 */
public class Buchstabenzaehler {

    /**
     * Einstiegspunkt in das Programm.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args) {
        Buchstabenzaehler bs = new Buchstabenzaehler();
//        bs.run();

    }

    /**
     * Startet den Buchstabenzaehler.
     *
     * @throws StatistikException Fehler bei der Berechnung der
     *      Buchstabenhäufigkeit.
     */
    private void run() {
//        System.out.print("Bitte geben Sie den Dateinamen an: ");
//        Scanner scanner = new Scanner(System.in);
//        String dateiname = scanner.nextLine();
//
//        int[] statistik;
//
//        statistik = parseFile("assets/" + dateiname);
//        printStatistik(statistik);
//        scanner.close();
    }

    /**
     * Druckt die Statistik aus.
     *
     * @param statistik Statistik
     * @throws StatistikException Fehler bei den Eingabedaten
     */
    private void printStatistik(int[] statistik) {

//        int summe = 0;
//
//        for (int haeufigkeit : statistik) {
//            summe += haeufigkeit;
//        }
//
//        double prozentSumme = 0.0;
//
//        for (char c = 'a'; c <= 'z'; c++) {
//            int anzahl = statistik[c - 'a'];
//            double prozent = (double) anzahl / (double) summe * 100;
//            System.out.printf("%s: %.2f%% %n", "" + c, prozent);
//
//            prozentSumme += prozent;
//        }
//
//        if ((prozentSumme < 99.0) || (prozentSumme > 101.0)) {
//            throw new StatistikException(Double.toString(prozentSumme));
//        }
//
//        System.out.printf("Summe: %.2f%% %n", prozentSumme);
    }

    /**
     * Analysiert die übergebene Datei und berechnet die Buchstabenhäufigkeit.
     *
     * @param filename Dateiname
     * @return die Buchstabenhäufigkeit. Das 'a' ist das erste Element,
     *          das 'b' das zweite etc.
     * @throws IOException generelles IO-Problem
     * @throws FileNotFoundException Datei gibt es nicht
     */
    private int[] parseFile(String filename) {

        int[] statistik = new int['z' - 'a' + 1];
//
//        BufferedReader br = new BufferedReader(new FileReader(filename));
//
//        String line;
//
//        while ((line = br.readLine()) != null) {
//            char[] chars = line.toLowerCase().toCharArray();
//
//            for (char c : chars) {
//                if (('a' <= c) && (c <= 'z')) {
//                    statistik[c - 'a']++;
//                }
//            }
//        }
//
//        br.close();

        return statistik;
    }
}
