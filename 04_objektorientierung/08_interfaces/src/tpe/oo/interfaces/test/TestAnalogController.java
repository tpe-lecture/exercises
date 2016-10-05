package tpe.oo.interfaces.test;

import org.junit.Test;

//import tpe.oo.interfaces.api.AnalogController;
//import tpe.oo.interfaces.impl.AnalogControllerImpl;

/**
 * Tests für einen analogen Joystick.
 */
public class TestAnalogController extends TestDigitalController {

//    /**
//     * Testet einen anlogen Controller.
//     */
//    @Test
//    public void testAnalogController() {
//        AnalogController c = new AnalogControllerImpl();
//        testAnalogController(c);
//    }
//
//    /**
//     * Interne Hilfsmethode zum Test von analogen Controllern.
//     *
//     * @param c Controller, der getestet wird
//     */
//    protected void testAnalogController(AnalogController c) {
//        c.up(0.5);
//        assertPointEquals(0, 0, c.getPosition());
//        c.up(0.5);
//        assertPointEquals(0, -1, c.getPosition());
//
//        c.left(0.3);
//        c.left(0.3);
//        c.left(0.3);
//        assertPointEquals(0, -1, c.getPosition());
//        c.left(0.2);
//        assertPointEquals(-1, -1, c.getPosition());
//
//        c.down(1.0);
//        assertPointEquals(-1, 0, c.getPosition());
//
//        c.down(1.0);
//        assertPointEquals(-1, 1, c.getPosition());
//        c.down(1.0);
//        assertPointEquals(-1, 2, c.getPosition());
//
//        c.right(0.5);
//        c.right(0.5);
//        c.right(0.5);
//        assertPointEquals(0, 2, c.getPosition());
//    }
}
