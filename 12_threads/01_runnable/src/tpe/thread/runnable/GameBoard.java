package tpe.thread.runnable;

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

    /** Ufos, die durch das Bild fliegen. */
    private Ufo[] ufos = {
        new Ufo(this, 0, 30, 10),
        new Ufo(this, 20, 100, 5),
        new Ufo(this, 50, 170, 20),
        new Ufo(this, 10, 230, 3),
    };

    /** Hintergrund-Bild. */
    private SimpleImage background = new SimpleImage("assets/background-0");

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(800, 300), Color.BLACK);

        // Threads starten
        Thread[] ts = new Thread[ufos.length];
        for (int i = 0; i < ts.length; i++) {
         // TODO: Einkommentieren
//            ts[i] = new Thread(ufos[i]);
//            ts[i].start();
        }
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
