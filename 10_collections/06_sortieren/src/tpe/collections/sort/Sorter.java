package tpe.collections.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Klasse zum Sortieren von Strings.
 */
public class Sorter {

    /** Sortierreihenfolge für die Strings. */
    public enum SortOrder {

        /** Aufsteigend. */
        ASCENDING,

        /** Absteigend. */
        DESCENDING,

        /** Aufsteigend, ohne Beachtung der Groß-/Kleinschreibung. */
        ASCENDING_CASE_INSENSITIVE,

        /** Absteigend, ohne Beachtung der Groß-/Kleinschreibung. */
        DESCENDING_CASE_INSENSITIVE;
    }

    /**
     * Liefert einen Comparator für Strings.
     *
     * @param order Sortierreihenfolge.
     * @return Comparator, entsprechend der gewünschten Sortierreihenfolge.
     */
    private static Comparator<String> stringComparator(final SortOrder order) {
        // TODO: Methode implementieren
        return null;
    }

    /**
     * Sortiert das übergebene Array entsprechend der gewünschten Reihenfolge.
     *
     * @param array das zu sortierende Array.
     * @param order die Sortierreihenfolge.
     */
    public static void sort(String[] array, SortOrder order) {
        Arrays.sort(array, stringComparator(order));
    }
}
