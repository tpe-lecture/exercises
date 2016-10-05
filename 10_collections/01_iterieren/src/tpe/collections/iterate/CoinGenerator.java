package tpe.collections.iterate;

import java.awt.Point;
import java.util.Iterator;
import java.util.Random;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.SimpleImage;
import de.smits_net.games.framework.sprite.Sprite;
import de.smits_net.games.framework.sprite.Sprite.BoundaryPolicy;

/**
 * Klasse, die eine beliebige Menge an Geld generiert.
 */
public class CoinGenerator implements Iterable<Sprite> {

    /** Zufallszahlen-Generator. */
    private static final Random RND = new Random();

    /** Das Spielfeld. */
    private Board board;

    /** Anzahl der Münzen, die erzeugt werden sollen. */
    private int number;

    /**
     * Erzeugt eine neue Instanz, die zu dem übergebenen Spielfeld gehört.
     *
     * @param board Das Spielfeld.
     * @param number Anzahl der Münzen.
     */
    public CoinGenerator(Board board, int number) {
        this.board = board;
        this.number = number;
    }

    /**
     * Erzeugt einen neuen Iterator.
     *
     * @return Der Iterator.
     */
    public Iterator<Sprite> iterator() {
        return new Iterator<Sprite>() {

            int count = 0;

            public boolean hasNext() {
                return count < number;
            }

            public Sprite next() {
                count++;
                return createCoin();
            }
        };
    }

    /**
     * Legt eine zufällige Münze an.
     *
     * @return die Münze als Sprite.
     */
    private Sprite createCoin() {
        String asset;

        switch (RND.nextInt(8)) {
            case 0: asset = "assets/1c.png"; break;
            case 1: asset = "assets/2c.png"; break;
            case 3: asset = "assets/5c.png"; break;
            case 4: asset = "assets/10c.png"; break;
            case 5: asset = "assets/20c.png"; break;
            case 6: asset = "assets/50c.png"; break;
            case 7: asset = "assets/1e.png"; break;
            default: asset = "assets/2e.png"; break;
        }

        int xPos = RND.nextInt(board.getWidth()) - 20;
        int yPos = RND.nextInt(board.getHeight()) - 20;

        return new Sprite(board, new Point(xPos, yPos),
                BoundaryPolicy.NONE,
                new SimpleImage(asset));
    }
}
