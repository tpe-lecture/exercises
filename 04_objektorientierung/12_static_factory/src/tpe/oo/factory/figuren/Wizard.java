package tpe.oo.factory.figuren;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.AnimatedImage;

/**
 * Zauberer.
 */
public class Wizard extends Figur {
    
    /**
     * Neuer Figur anlegen.
     *
     * @param board das Spielfeld
     */
    public Wizard(Board board) {
        super(board, new AnimatedImage(50, 8, "assets/wizard.png"));
    }
}
