package tpe.object.equalshashcode.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tpe.object.equalshashcode.Ork;
import tpe.object.equalshashcode.Wesen;

/**
 * Testklasse für die Wesen.
 */
public class TestWesen {

    /**
     * Testet equals und hashCode von Wesen.
     */
    @Test
    public void testWesen() {
        Wesen w1 = new Wesen("Azok", 30);
        Wesen w2 = new Wesen("Azok", 30);
        Wesen w3 = new Wesen("Azok", 31);
        Wesen w4 = new Wesen("Gorrok", 30);
        Wesen w5 = new Wesen("Gorrok", 31);

        assertFalse(w1 == w2);
        assertTrue(w1.equals(w2));

        assertFalse(w1 == w3);
        assertFalse(w1.equals(w3));

        assertFalse(w1 == w4);
        assertFalse(w1.equals(w4));

        assertFalse(w1 == w5);
        assertFalse(w1.equals(w5));

        assertTrue(w1.hashCode() == w2.hashCode());
    }

    /**
     * Testet equals und hashCode von Ork.
     */
    @Test
    public void testOrk() {
        Ork o1 = new Ork("Snagas", true);
        Ork o2 = new Ork("Snagas", true);
        Ork o3 = new Ork("Snagas", false);
        Ork o4 = new Ork("Berg-Ork", false);
        Ork o5 = new Ork("Berg-Ork", true);
        Ork o6 = new Ork("Berg-Ork", false);
        Wesen w = new Wesen("Snagas", 17);

        assertFalse(o1 == o2);
        assertTrue(o1.equals(o2));

        assertFalse(o1 == o3);
        assertFalse(o1.equals(o3));

        assertFalse(o1 == o4);
        assertFalse(o1.equals(o4));

        assertFalse(o1 == o5);
        assertFalse(o1.equals(o5));

        assertTrue(o1.hashCode() == o2.hashCode());
        assertTrue(o4.hashCode() == o6.hashCode());

        assertFalse(w.equals(o1));
        assertFalse(w.equals(o2));
        assertFalse(w.equals(o3));
        assertFalse(o1.equals(null));
        assertFalse(o1.equals("Hugo"));
        assertTrue(o1.equals(o1));

        // Diese Tests muss nicht zwangsweise funktionieren, da
        // ungleiche Objekte einen identischen Hashcode haben können.
        // Wir gehen hier aber davon aus, dass eine Hashkollision
        // sehr selten ist und machen daher aus didaktischen Gründen
        // diesen Test.
        assertFalse(o1.hashCode() == o3.hashCode());
        assertFalse(o1.hashCode() == o4.hashCode());
        assertFalse(o1.hashCode() == o5.hashCode());
        assertFalse(o4.hashCode() == o5.hashCode());
    }
}
