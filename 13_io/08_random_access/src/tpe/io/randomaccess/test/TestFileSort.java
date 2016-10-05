package tpe.io.randomaccess.test;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import tpe.io.randomaccess.FileSort;

/**
 * Testet die Sortierung per Random-Access-File.
 */
public class TestFileSort {

    /**
     * Kopiert die Datei f1 als Datei f2.
     *
     * @param f1 Quell-Datei
     * @param f2 Ziel-Datei
     * @throws IOException IO-Probleme
     */
    private static void copyFile(String f1, String f2) throws IOException {

        FileInputStream fis = new FileInputStream(f1);
        FileOutputStream fos = new FileOutputStream(f2);

        int b;

        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fis.close();
        fos.close();
    }

    /**
     * Testet die File-Sortierung.
     *
     * @throws IOException IO-Problem
     */
    @Test
    public void testBubbleSort() throws IOException {
        copyFile("assets/data.dat", "output/data.dat");
        FileSort.sortFile("output/data.dat");

        InputStream is = new FileInputStream("output/data.dat");

        int data;
        byte lastByte = 0;

        while ((data = is.read()) >= 0) {
            byte b = (byte) data;
            assertTrue(b >= lastByte);
            lastByte = b;
        }

        is.close();
    }
}
