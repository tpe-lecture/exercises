package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.DigitalController;

/**
 * Implementierung eines digitalen Joysticks.
 */
public class DigitalControllerImpl implements DigitalController {

    private Point position = new Point(0, 0);

    /**
     * @see tpe.oo.interfaces.api.DigitalController#up()
     */
    @Override
    public void up() {
        position.translate(0, -1);
    }

    /**
     * @see tpe.oo.interfaces.api.DigitalController#down()
     */
    @Override
    public void down() {
        position.translate(0, 1);
    }

    /**
     * @see tpe.oo.interfaces.api.DigitalController#left()
     */
    @Override
    public void left() {
        position.translate(-1, 0);
    }

    /**
     * @see tpe.oo.interfaces.api.DigitalController#right()
     */
    @Override
    public void right() {
        position.translate(1, 0);
    }

    /**
     * @see tpe.oo.interfaces.api.DigitalController#getPosition()
     */
    @Override
    public Point getPosition() {
        return (Point) position.clone();
    }
}
