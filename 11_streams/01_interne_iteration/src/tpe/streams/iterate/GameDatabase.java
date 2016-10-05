package tpe.streams.iterate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Datenbank für die Spiele.
 */
public class GameDatabase {

    private List<ComputerGame> games;

    /**
     * Datenbank mit Spieleinfomrationen.
     */
    @SuppressWarnings("deprecation")
    public GameDatabase() {
        games = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("assets/games.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(";");
                int metacritic = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                int userScore = (int) (Double.parseDouble(tokens[2]) * 10);
                Date date = new SimpleDateFormat("MMM d, yyyy",
                        Locale.US).parse(tokens[3]);

                games.add(new ComputerGame(name, date.getYear() + 1900,
                        metacritic, userScore));
            }

            br.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Gibt die Liste der Spiele zurück.
     *
     * @return Liste der Spiele
     */
    public List<ComputerGame> getGames() {
        return new ArrayList<>(games);
    }
}
