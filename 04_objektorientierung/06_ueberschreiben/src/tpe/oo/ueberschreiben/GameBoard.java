package tpe.oo.ueberschreiben;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import de.smits_net.games.framework.board.Board;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /** Alien, das durch das Bild läuft. */
    private Alien alien;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(400, 400), Color.BLACK);

        // Alien initialisieren
        alien = new Alien(this, new Point(400, 50 + new Random().nextInt(100)));

        // Alien soll auf Maus-Klicks reagieren
        addMouseListener(alien);
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGame(Graphics g) {
        // Alien zeichnen
        alien.draw(g, this);
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        alien.move();
        return alien.isVisible();
    }
}
