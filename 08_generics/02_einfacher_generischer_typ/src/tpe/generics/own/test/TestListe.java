package tpe.generics.own.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tpe.generics.own.Liste;

/**
 * Test für die Liste.
 */
public class TestListe {

    /**
     * Testet das Hinzufügen und Löschen der Liste.
     */
    @Test
    public void testAddAndClear() {
        Liste l = new Liste();

        assertEquals(0, l.size());

        l.add("Hallo");
        assertEquals(1, l.size());
        l.add("Hugo");
        assertEquals(2, l.size());
        l.add("Peter");
        l.add("Alfons");
        assertEquals(4, l.size());

        l.clear();
        assertEquals(0, l.size());
    }

    /**
     * Testet das Lesen von Elementen.
     */
    @Test
    public void testGet() {
        Liste l = new Liste();
        l.add("Hallo");
        l.add("Hugo");
        l.add("Peter");
        l.add("Alfons");

        assertEquals(null, l.get(-1));
        assertEquals(null, l.get(4));
        assertEquals("Hallo", l.get(0));
        assertEquals("Hugo", l.get(1));
        assertEquals("Peter", l.get(2));
        assertEquals("Alfons", l.get(3));

        assertEquals(4, l.size());
        l.clear();
        assertEquals(0, l.size());
        assertEquals(null, l.get(0));
        assertEquals(null, l.get(1));
        assertEquals(null, l.get(2));
        assertEquals(null, l.get(3));
    }
}
