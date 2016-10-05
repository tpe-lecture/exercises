package tpe.thread.join;

import java.awt.Graphics;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;
import de.smits_net.games.framework.image.StripedImage;

/**
 * Ein Ufo.
 */
public class Ufo extends AnimatedImage implements Runnable {

    /** X-Position des Ufos. */
    private int x;

    /** Y-Position des Ufos. */
    private int y;

    /** Zeit, die das Ufo schlafen soll, before es sich weiterbewegt. */
    private int sleepTime;

    /** Das zugehörige Spielfeld. */
    private Board board;

    /**
     * Legt ein neues Ufo an.
     *
     * @param board das Spielfeld.
     * @param x die X-Position für den Start.
     * @param y die Y-Position für den Start.
     * @param sleepTime Zeit, die das Ufo schlafen soll,
     *          before es sich weiterbewegt.
     */
    public Ufo(Board board, int x, int y, int sleepTime) {
        super(50, false, "assets", "spaceship");
        this.x = x;
        this.y = y;
        this.sleepTime = sleepTime;
        this.board = board;
    }

    /**
     * Zeichnet das Ufo.
     *
     * @param g Grafik-Kontext.
     */
    public void draw(Graphics g) {
        super.draw(g, new Point(x, y), null);
    }

    /**
     * @see java.lang.Runnable#run()
     */
    public void run() {
        while (x < board.getWidth() - getDimension().getWidth()) {

            // Ufo weiter bewegen
            x++;

            // Schlafen, bis die nächste Bewegung erfolgen soll
            try {
                Thread.sleep(sleepTime);
            }
            catch (InterruptedException e) {
                break;
            }
        }

        System.out.println("Ich habe fertig...");
    }

    /**
     * Let the Ufo explode.
     */
    public void explode() {
        this.images = new StripedImage("assets/explosion", 43);
        this.images.setWrapAround(false);
    }
}
