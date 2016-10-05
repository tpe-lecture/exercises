package tpe.oo.vererbung;

import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;
import de.smits_net.games.framework.image.StripedImage;
import de.smits_net.games.framework.sprite.AnimatedSprite;
import de.smits_net.games.framework.sprite.Direction;

/**
 * Ein Alien.
 */
public class AlienSprite {
// TODO: Von AnimatedSprite ableiten

    /** Geschwindigkeit des Alien X-Richtung. */
    private static final int ALIEN_SPEED = 2;

    /**
     * Neues Alien anlegen.
     *
     * @param board das Spielfeld
     * @param startPoint Start-Position
     */
    public AlienSprite(Board board, Point startPoint) {
// TODO: Einkommentieren
//        super(board, startPoint, BoundaryPolicy.JUMP_BACK, new AlienImage());
//        velocity.setVelocity(Direction.WEST, ALIEN_SPEED);
    }

    /**
     * Alien explodieren lassen.
     */
    public void explode() {
// TODO: Einkommentieren
//        setActive(false);
//        setImages(new AnimatedImage(20,
//                new StripedImage("assets/explosion", 43)));
//        setInvisibleAfterFrames(70);
    }
}
