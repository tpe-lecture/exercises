package tpe.nested.nonstaticmember;

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
        super("Click Alien - (02) Nonstatic Member", new GameBoard());
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

