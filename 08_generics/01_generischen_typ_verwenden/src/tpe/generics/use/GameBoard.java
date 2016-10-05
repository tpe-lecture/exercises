package tpe.generics.use;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.Random;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.SimpleImage;
import de.smits_net.games.framework.sprite.Sprite;
import de.smits_net.games.framework.sprite.Sprite.BoundaryPolicy;
import de.smits_net.games.framework.sprite.Velocity;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /** Münzstapel. */
    // TODO: Münzen als Stack speichern

    /** A moving coin. */
    private Sprite moving;

    /** Punkte. */
    private int points = 0;

    /** Zeitpunkt des ersten Klicks. */
    private long startzeit;

    /** Zufallszahlengenerator. */
    private final Random rnd = new Random();

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(400, 400), Color.BLACK);

        // Münzen anlegen
        for (int i = 0; i < 20; i++) {
            // TODO: Neue Münzen auf den Stapel legen
        }
    }

    /**
     * Legt eine zufällige Münze an.
     *
     * @return die Münze als Sprite.
     */
    private Sprite createCoin() {
        String asset;

        switch (rnd.nextInt(8)) {
            case 0: asset = "assets/1c.png"; break;
            case 1: asset = "assets/2c.png"; break;
            case 3: asset = "assets/5c.png"; break;
            case 4: asset = "assets/10c.png"; break;
            case 5: asset = "assets/20c.png"; break;
            case 6: asset = "assets/50c.png"; break;
            case 7: asset = "assets/1e.png"; break;
            default: asset = "assets/2e.png"; break;
        }

        int offset = rnd.nextInt(10);

        return new Sprite(this, new Point(100 + offset, 100 + offset),
                BoundaryPolicy.NONE,
                new SimpleImage(asset));
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public synchronized void drawGame(Graphics g) {
        // TODO: Über alle Objekte im Stapel laufen und sie zeichnen

        if (moving != null) {
            moving.draw(g, this);
        }

        writeText(g, 0, 20, "Punkte: " + points);
    }

    /**
     * Spielfeld zeichnen.
     *
     * @param g Grafik-Kontext.
     */
    @Override
    protected void drawGameOver(Graphics g) {
        centerText(g, String.format("%d Punkte in %.2f Sekunden", points,
                    (System.currentTimeMillis() - startzeit) / 1000.0));
    }

    /**
     * Mausklick abfangen.
     *
     * @param e Maus-Event.
     */
    @Override
    public synchronized void mouseClicked(MouseEvent e) {

        if (startzeit == 0) {
            startzeit = System.currentTimeMillis();
        }

        // TODO: Wenn Stapel leer ist, nichts tun

        // TODO: Oberstes Sprite vom Stapel ansehen und s zuweisen
        Sprite s = null;

        if (s.intersects(new Point(e.getX(), e.getY()))) {
            points++;

            // TODO: Oberstes Sprite vom Stapel entfernen und s zuweisen

            moving = s;
            moving.setVelocity(new Velocity(0, 20));
        }
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        
        if (moving != null) {
            moving.move();
        }
        
        // TODO: Solange Stapel noch Elemente enthält, true zurückgeben.
        return true;
    }
}
