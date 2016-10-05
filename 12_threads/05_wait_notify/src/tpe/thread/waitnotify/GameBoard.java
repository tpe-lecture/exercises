package tpe.thread.waitnotify;

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

    /** Ufos. */
    private Ufo[] ufos = {
        new Ufo(this, 0, 130, 240, 15),
        new Ufo(this, 100, 130, 320, 10),
        new Ufo(this, 200, 130, 400, 5),
    };

    /** Hintergrund-Bild. */
    private SimpleImage background = new SimpleImage("assets/background-3");

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(800, 300), Color.BLACK);

        for (Ufo ufo : ufos) {
            new Thread(ufo).start();
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
