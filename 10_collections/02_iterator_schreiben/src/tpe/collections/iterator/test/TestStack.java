package tpe.collections.iterator.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Test;

import tpe.collections.iterator.SimpleStack;

/**
 * Test für den Stack.
 */
public class TestStack {

    /**
     * Testet den Stack an sich.
     */
    @Test
    public void testStack() {
        SimpleStack<String> s = new SimpleStack<>(10);
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        assertEquals("D", s.peek());
        assertEquals("D", s.pop());
        assertEquals("C", s.pop());
        assertEquals("B", s.pop());
        s.push("A2");
        s.push("A3");
        assertEquals("A3", s.peek());
        assertEquals("A3", s.pop());
        assertEquals("A2", s.pop());
        assertEquals("A", s.pop());
    }

//    /**
//     * Testet den Iterator.
//     */
//    @Test
//    public void testIterator() {
//        SimpleStack<String> s = new SimpleStack<>(10);
//        s.push("A");
//        s.push("B");
//        s.push("C");
//        s.push("D");
//
//        String[] result = new String[5];
//        int count = 0;
//
//        for (String string : s) {
//            result[count++] = string;
//        }
//
//        assertEquals("D", s.peek());
//
//        assertEquals("D", result[0]);
//        assertEquals("C", result[1]);
//        assertEquals("B", result[2]);
//        assertEquals("A", result[3]);
//
//        s.push("E");
//
//        Iterator<String> it = s.iterator();
//
//        count = 0;
//        while (it.hasNext()) {
//            result[count++] = it.next();
//        }
//
//        assertEquals("E", result[0]);
//        assertEquals("D", result[1]);
//        assertEquals("C", result[2]);
//        assertEquals("B", result[3]);
//        assertEquals("A", result[4]);
//
//        assertFalse(it.hasNext());
//
//        it = s.iterator();
//
//        assertTrue(it.hasNext());
//    }
}
