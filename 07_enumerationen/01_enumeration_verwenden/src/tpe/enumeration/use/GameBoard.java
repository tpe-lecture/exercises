package tpe.enumeration.use;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /** Sprite, das durch das Bild läuft. */
    private Professor sprite;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(400, 400), Color.BLACK);

        // Sprite initialisieren
        sprite = new Professor(this, new Point(300, 200));
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGame(Graphics g) {
        sprite.draw(g, this);
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        sprite.move();
        return sprite.isVisible();
    }
}
