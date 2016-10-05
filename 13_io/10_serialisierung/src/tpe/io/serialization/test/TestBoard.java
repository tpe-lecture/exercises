package tpe.io.serialization.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import tpe.io.serialization.Board;
import tpe.io.serialization.Color;


/**
 * Test.
 */
public class TestBoard {

    /**
     * Test für die Implementierung des Spielbrettes.
     *
     * @throws IOException Datei-Probleme.
     */
    @Test
    public void testDame() throws IOException {
        Board s = new Board();
        s.set("a1", Color.BLACK);
        s.set("b1", Color.WHITE);
        s.set("h1", Color.BLACK);
        s.set("h2", Color.BLACK);
        s.set("a8", Color.BLACK);
        s.set("f8", Color.BLACK);
        s.set("f5", Color.WHITE);
        s.set("e3", Color.WHITE);
        s.set("g2", Color.WHITE);

        String stringRepresentation = s.toString();

        s.writeToFile("output/daten.dat");

        s = Board.loadFromFile("output/daten.dat");

        assertEquals(stringRepresentation, s.toString());

        s = Board.loadFromFile("output/testdata.dat");

        assertEquals(stringRepresentation, s.toString());
    }
}
