package tpe.object.clone.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

import tpe.object.clone.Alien;
import tpe.object.clone.Raumanzug;


/**
 * Test für die Clone-Methoden.
 */
public class TestAlienClone {

//    /**
//     * Test-Methode.
//     * @throws CloneNotSupportedException wird geworfen, wenn clone
//     *          nicht korrekt implementiert wurde.
//     */
//    @Test
//    public void testClone() throws CloneNotSupportedException {
//        Raumanzug r1 = new Raumanzug();
//        Alien a1 = new Alien("Predator", r1);
//
//        Alien a2 = (Alien) a1.clone();
//        Raumanzug r2 = a2.getAnzug();
//
//        assertNotSame(a1, a2);
//        assertNotSame(r1, r2);
//
//        assertEquals(a1, a2);
//        assertEquals(r1, r2);
//        assertEquals(r1.getSauerstoffVorrat(),
//                r2.getSauerstoffVorrat(), 0.0001);
//    }
}
