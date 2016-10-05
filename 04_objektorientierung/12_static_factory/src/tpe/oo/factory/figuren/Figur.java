package tpe.oo.factory.figuren;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Random;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;
import de.smits_net.games.framework.sprite.AnimatedSprite;
import de.smits_net.games.framework.sprite.Direction;

/**
 * Eine Figur, die an einer zufälligen Stelle erscheint.
 */
public abstract class Figur extends AnimatedSprite {

    /** Geschwindigkeit des X-Richtung. */
    private static final int SPEED = 1;

    /**
     * Neuer Figur anlegen.
     *
     * @param board das Spielfeld
     * @param asset Bild für die Figur
     */
    public Figur(Board board, AnimatedImage asset) {
        super(board, new Point(new Random().nextInt(board.getWidth() * 2), 
                new Random().nextInt(300)), 
                BoundaryPolicy.JUMP_BACK,
                asset);
        velocity.setVelocity(Direction.WEST, SPEED);
        setBounds(new Rectangle(0, 0, 
                board.getWidth() + 400, board.getHeight()));
    }
}
