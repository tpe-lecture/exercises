package tpe.nested.staticmember;

import java.awt.EventQueue;

import de.smits_net.games.framework.board.MainWindow;

/**
 * Hauptklasse des Spiels.
 */
public class GameMain extends MainWindow {

    /**
     * Neues Spiel anlegen.
     */
    public GameMain() {
        super("Click Alien", new GameBoard());
    }

    /**
     * Startpunkt.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(GameMain::new);
    }
}

