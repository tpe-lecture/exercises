package tpe.thread.racecondition;

import java.util.ArrayList;
import java.util.List;

/**
 * Einfache Sammlung von Zahlen.
 */
public class NumberList {

    /** Die gespeicherten Zahlen. */
    private List<Integer> numbers = new ArrayList<>();

    /** Die letzte Zahl, die gespeichert wurde. */
    private int lastNumber;

    /**
     * Liefert die letzte Zahl, die gespeichert wurde.
     *
     * @return letzte Zahl.
     */
    public int getLastNumber() {
        return lastNumber;
    }

    /**
     * Fügt eine neue Zahl hinzu.
     *
     * @param number die zu speichernde Zahl.
     */
    public void add(int number) {
        lastNumber = number;
        numbers.add(number);
    }

    /**
     * Überprüft, ob die Zahlen fortlaufend sind.
     *
     * @throws IllegalArgumentException wenn die Zahlen nicht fortlaufend sind
     */
    public void check() {

        int number = 0;

        for (Integer integer : numbers) {
            number++;
            if (integer != number) {
                throw new IllegalStateException("Zahlen nicht fortlaufend!"
                        + " erwartet: " + number
                        + " gefunden: " + integer);
            }
        }
    }
}
