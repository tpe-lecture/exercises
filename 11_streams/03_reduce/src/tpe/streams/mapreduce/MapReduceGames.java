package tpe.streams.mapreduce;

import java.util.List;
import java.util.stream.Stream;

/**
 * Spiele auflisten.
 */
public class MapReduceGames {

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente.
     */
    public static void main(String[] args) {
        GameDatabase db = new GameDatabase();
        List<ComputerGame> games = db.getGames();

        // Abweichung des Metascores von dem Userscore
        // als Quadratisches Mittel berechnen.
        Stream<ComputerGame> stream = games.stream();

        // Abweichung als RMS
        stream = games.stream();
        double rms = stream
            .map(g -> g.getMetaScore() - g.getUserScore())
            .map(g -> g * g)
            .reduce(0, (sum, value) -> sum + value);
        rms /= games.size();
        rms = Math.sqrt(rms);

        // Abweichung als Arithmetisches Mittel
        stream = games.stream();
        double mittelwert = stream
                .map(g -> g.getMetaScore() - g.getUserScore())
                .reduce(0, (sum, value) -> sum + value);
        mittelwert /= games.size();

        System.out.printf("Abweichung Metascore: Durchschnitt=%.2f%n",
                mittelwert);
        System.out.printf("Abweichung Metascore: RMS=%.2f%n", rms);
    }
}
