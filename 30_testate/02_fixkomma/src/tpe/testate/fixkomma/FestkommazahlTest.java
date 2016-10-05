package tpe.testate.fixkomma;

import static org.junit.Assert.*;

import org.junit.Test;

public class FestkommazahlTest {

//    private long getVorKommaStellen(Festkommazahl f) {
//        return f.getVorkommaStellen();
//    }
//
//    private long getNachKommaStellen(Festkommazahl f) {
//        return f.getNachkommaStellen();
//    }
//
//    private Festkommazahl add(Festkommazahl f1, Festkommazahl f2) {
//        return f1.addiere(f2);
//    }
//
//    private Festkommazahl subtract(Festkommazahl f1, Festkommazahl f2) {
//        return f1.subtrahiere(f2);
//    }
//
//    private boolean equals(Festkommazahl f1, Festkommazahl f2) {
//        return f1.equals(f2);
//    }
//
//
//    @Test
//    public void testEquals() {
//        Festkommazahl z1 = new Festkommazahl(42, 23);
//        Festkommazahl z2 = new Festkommazahl(4223, 0);
//        Festkommazahl z3 = new Festkommazahl(4223, 0);
//
//        assertFalse(equals(z1, z2));
//        assertTrue(equals(z2, z3));
//    }
//
//    @Test
//    public void testToString() {
//        assertEquals("123456,09", new Festkommazahl(123456, 9).toString());
//        assertEquals("0,09", new Festkommazahl(0, 9).toString());
//        assertEquals("56,00", new Festkommazahl(56, 0).toString());
//    }
//
//    @Test
//    public void testGetter() {
//        assertEquals(8271, getVorKommaStellen(new Festkommazahl(8271, 72)));
//        assertEquals(0, getVorKommaStellen(new Festkommazahl(0, 99)));
//        assertEquals(72, getNachKommaStellen(new Festkommazahl(8271, 72)));
//        assertEquals(99, getNachKommaStellen(new Festkommazahl(0, 99)));
//        assertEquals(99, getNachKommaStellen(new Festkommazahl(0, 9900)));
//        assertEquals(0, getNachKommaStellen(new Festkommazahl(0, 0)));
//        assertEquals(10, getNachKommaStellen(new Festkommazahl(0, 100)));
//    }
//
//    @Test
//    public void testAdd() {
//
//        Festkommazahl result;
//
//        result = add(new Festkommazahl(11, 11), new Festkommazahl(22, 22));
//        assertEquals("33,33", result.toString());
//
//        result = add(new Festkommazahl(0, 11), new Festkommazahl(0, 22));
//        assertEquals("0,33", result.toString());
//
//        result = add(new Festkommazahl(11, 00), new Festkommazahl(22, 00));
//        assertEquals("33,00", result.toString());
//
//
//        result = add(new Festkommazahl(11, 11), new Festkommazahl(22, 22));
//        assertEquals("33,33", result.toString());
//
//        result = add(new Festkommazahl(0, 11), new Festkommazahl(0, 22));
//        assertEquals("0,33", result.toString());
//
//        result = add(new Festkommazahl(11, 00), new Festkommazahl(22, 00));
//        assertEquals("33,00", result.toString());
//
//        result = add(new Festkommazahl(11, 11), new Festkommazahl(22, 22));
//        assertEquals("33,33", result.toString());
//
//        result = add(new Festkommazahl(0, 11), new Festkommazahl(0, 22));
//        assertEquals("0,33", result.toString());
//
//        result = add(new Festkommazahl(11, 00), new Festkommazahl(22, 00));
//        assertEquals("33,00", result.toString());
//    }
//
//    @Test
//    public void testSubstract() {
//
//        Festkommazahl result;
//
//        result = subtract(new Festkommazahl(33, 33), new Festkommazahl(22, 22));
//        assertEquals("11,11", result.toString());
//
//        result = subtract(new Festkommazahl(0, 33), new Festkommazahl(0, 22));
//        assertEquals("0,11", result.toString());
//
//        result = subtract(new Festkommazahl(33, 00), new Festkommazahl(22, 00));
//        assertEquals("11,00", result.toString());
//
//
//        result = subtract(new Festkommazahl(33, 33), new Festkommazahl(22, 22));
//        assertEquals("11,11", result.toString());
//
//        result = subtract(new Festkommazahl(0, 33), new Festkommazahl(0, 22));
//        assertEquals("0,11", result.toString());
//
//        result = subtract(new Festkommazahl(33, 00), new Festkommazahl(22, 00));
//        assertEquals("11,00", result.toString());
//
//        result = subtract(new Festkommazahl(33, 33), new Festkommazahl(22, 22));
//        assertEquals("11,11", result.toString());
//
//        result = subtract(new Festkommazahl(0, 33), new Festkommazahl(0, 22));
//        assertEquals("0,11", result.toString());
//
//        result = subtract(new Festkommazahl(33, 00), new Festkommazahl(22, 00));
//        assertEquals("11,00", result.toString());
//    }
}
