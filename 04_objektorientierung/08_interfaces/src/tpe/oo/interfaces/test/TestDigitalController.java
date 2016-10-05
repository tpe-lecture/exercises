package tpe.oo.interfaces.test;

import static org.junit.Assert.assertEquals;

import java.awt.Point;

import org.junit.Test;

import tpe.oo.interfaces.api.DigitalController;
import tpe.oo.interfaces.impl.DigitalControllerImpl;

/**
 * Tests für einen digitalen Joystick.
 */
public class TestDigitalController {

    /**
     * Testet einen digitalen Controller.
     */
    @Test
    public void testDigitalController() {
        DigitalController c = new DigitalControllerImpl();
        testDigitalController(c);
    }

    /**
     * Interne Hilfsmethode zum Test von digitalen Controllern.
     *
     * @param c Controller, der getestet wird
     */
    protected void testDigitalController(DigitalController c) {
        assertPointEquals(0, 0, c.getPosition());
        c.up();
        c.up();
        assertPointEquals(0, -2, c.getPosition());
        c.down();
        c.down();
        assertPointEquals(0, 0, c.getPosition());
        c.left();
        c.right();
        assertPointEquals(0, 0, c.getPosition());
        c.left();
        assertPointEquals(-1, 0, c.getPosition());
        c.left();
        assertPointEquals(-2, 0, c.getPosition());
        c.right();
        c.right();
        c.right();
        assertPointEquals(1, 0, c.getPosition());
    }

    /**
     * Interne Hilfsmethode, um einen Punkt mit seinem x und
     * y-Wert zu vergleichen.
     *
     * @param x x-Wert
     * @param y y-Wert
     * @param point Punkt, der verglichen werden soll
     */
    protected void assertPointEquals(int x, int y, Point point) {
        assertEquals(new Point(x, y), point);
    }
}
