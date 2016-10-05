import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit-Test für den Rechner.
 */
public class TestRechner {

    /**
     * Testet alle Grundoperationen des Rechners.
     */
    @Test
    public void testRechner() {
        Rechner r = new Rechner();
        
        // 2 + 2 = 4
        r.addiere(2.0, 2.0);
        assertEquals(4.0, r.wert, 0.0001);
        
        // 3 - 1 = 2
        r.subtrahiere(3, 1);
        assertEquals(2.0, r.wert, 0.0001);
        
        // 3 * 3 = 9
        r.multipliziere(3, 3);
        assertEquals(9.0, r.wert, 0.0001);

        // 2 + 2 * 2 = 6
        r.multipliziere(2, 2);
        r.speichern();
        r.addiere(2, r.speicher);
        assertEquals(6.0, r.wert, 0.0001);
    }
}
