package tpe.thread.join;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.SimpleImage;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /**
     * Class to handle the joining of the Ufos.
     */
    class UfoJoiner implements Runnable {

        /**
         * @see java.lang.Runnable#run()
         */
        public void run() {

            // TODO: Threads vereinigen

            // TODO: Ufos sprengen, wenn alle Threads zu Ende gekommen sind
        }
    }

    /** Ufos, die durch das Bild fliegen. */
    private Ufo[] ufos = {
        new Ufo(this, 0, 30, 2),
        new Ufo(this, 20, 100, 5),
        new Ufo(this, 30, 170, 8),
        new Ufo(this, 10, 230, 3),
    };

    /** Hintergrund-Bild. */
    private SimpleImage background = new SimpleImage("assets/background-2");

    /** Threads running. */
    private Thread[] threads;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(800, 300), Color.BLACK);

        // Thread starten
        threads = new Thread[ufos.length];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(ufos[i]);
            threads[i].start();
        }

        Thread joinerThread = new Thread(new UfoJoiner());
        joinerThread.start();
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGame(Graphics g) {
        for (Ufo ufo : ufos) {
            ufo.draw(g);
        }
    }

    /**
     * Hintergrund zeichnen.
     */
    @Override
    protected void drawBackground(Graphics g) {
        background.draw(g, new Point(0, 0), null);
    }

    /**
     * @see de.smits_net.games.framework.board.Board#updateGame()
     */
    @Override
    public boolean updateGame() {
        return true;
    }
}
