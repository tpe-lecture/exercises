package tpe.thread.cancel;

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
        super("To boldly go, where no man has gone before...", new GameBoard());
    }

    /**
     * Startpunkt.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Spiel starten
        EventQueue.invokeLater(GameMain::new);
    }
}

