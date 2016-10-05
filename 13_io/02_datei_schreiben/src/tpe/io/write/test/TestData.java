package tpe.io.write.test;

import static org.junit.Assert.assertArrayEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import tpe.io.write.WriteData;

/**
 * Test für die geschriebenen Daten.
 */
public class TestData {

    /**
     * Geschriebene Daten testen.
     *
     * @throws IOException Datei-Probleme.
     */
    @Test
    public void testData() throws IOException {

        WriteData.main(new String[0]);

        InputStream is = new FileInputStream("temp/daten.dat");

        byte[] buffer = new byte[10];
        is.read(buffer);
        assertArrayEquals(new byte[] {
            (byte) 0xca,
            (byte) 0xff,
            (byte) 0xfe,
            (byte) 0xba,
            (byte) 0xbe,
            (byte) 0x00,
            (byte) 0xde,
            (byte) 0xad,
            (byte) 0xbe,
            (byte) 0xef },
            buffer);

        is.close();
    }
}
