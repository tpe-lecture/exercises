package tpe.thread.cancel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

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
    private SimpleImage background = new SimpleImage("assets/background-1");

    /** Threads running. */
    private Thread[] threads;

    /** Roter Knopf. */
    private RedButton button = new RedButton();

    /** Position des roten Knopfes. */
    private Point buttonPosition;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(800, 300), Color.BLACK);

        // Thread starten
        threads = new Thread[ufos.length];
        for (int i = 0; i < threads.length; i++) {
// TODO: Einkommentieren
//            threads[i] = new Thread(ufos[i]);
//            threads[i].start();
        }

        buttonPosition = new Point(
                getWidth() - button.getDimension().width - 20,
                getHeight() - button.getDimension().height - 20);
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGame(Graphics g) {
        button.draw(g, buttonPosition, this);

        for (Ufo ufo : ufos) {
            ufo.draw(g);
        }
    }

    /**
     * @see de.smits_net.games.framework.board.Board#updateGame()
     */
    @Override
    public boolean updateGame() {
        return true;
    }

    /**
     * Hintergrund zeichnen.
     */
    @Override
    protected void drawBackground(Graphics g) {
        background.draw(g, new Point(0, 0), null);
    }

    /**
     * Maus geklickt.
     *
     * @param e Event
     */
    @Override
    public void mouseClicked(MouseEvent e) {

        if ((e.getX() >= buttonPosition.x)
            && (e.getX() <= buttonPosition.x + button.getDimension().width)
            && (e.getY() >= buttonPosition.y)
            && (e.getY() <= buttonPosition.y + button.getDimension().height)) {

            // TODO: Threads der Ufos sauber beenden
        }
    }
}
