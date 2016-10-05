package tpe.enumeration.use;

import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;
import de.smits_net.games.framework.sprite.AnimatedSprite;
import de.smits_net.games.framework.sprite.Direction;

/**
 * Ein Sprite.
 */
public class Professor extends AnimatedSprite {

    /** Geschwindigkeit der Figur in X-Richtung. */
    private static final int SPRITE_SPEED = 2;

    /**
     * Neues Sprite anlegen.
     *
     * @param board das Spielfeld
     * @param startPoint Start-Position
     */
    public Professor(Board board, Point startPoint) {
        super(board, startPoint, BoundaryPolicy.NONE,
                new AnimatedImage(50, 9,
                        "assets/professor_left"));
        velocity.setVelocity(Direction.WEST, SPRITE_SPEED);
    }
}
