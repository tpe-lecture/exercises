package tpe.collections.sort.test;

import org.junit.Assert;
import org.junit.Test;

import tpe.collections.sort.Sorter;
import tpe.collections.sort.Sorter.SortOrder;


/**
 * Test für die Sortierung.
 */
public class TestSorter {

    private static String[] data = {
        "aaron",
        "ALFONS",
        "bond",
        "BerND",
        "henry",
        "Hugo"
    };

    /**
     * Testet die Sortierung: aufsteigend.
     */
    @Test
    public void testAscendingSorting() {

        String[] asc = data.clone();

        Sorter.sort(asc, SortOrder.ASCENDING);

        Assert.assertArrayEquals(
                new String[] {"ALFONS", "BerND",
                    "Hugo", "aaron", "bond", "henry"}, asc);
    }

    /**
     * Testet die Sortierung: Absteigend.
     */
    @Test
    public void testDescendingSorting() {

        String[] desc = data.clone();
        Sorter.sort(desc, SortOrder.DESCENDING);

        Assert.assertArrayEquals(
                new String[] {"henry", "bond", "aaron",
                    "Hugo", "BerND", "ALFONS"}, desc);
    }

    /**
     * Testet die Sortierung: Aufsteigend, CI.
     */
    @Test
    public void testAscendingCISorting() {

        String[] ascCI = data.clone();
        Sorter.sort(ascCI, SortOrder.ASCENDING_CASE_INSENSITIVE);

        Assert.assertArrayEquals(
                new String[] {"aaron", "ALFONS", "BerND",
                    "bond", "henry", "Hugo"}, ascCI);
    }

    /**
     * Testet die Sortierung: Absteigend, CI.
     */
    @Test
    public void testDescendingCISorting() {

        String[] descCI = data.clone();

        Sorter.sort(descCI, SortOrder.DESCENDING_CASE_INSENSITIVE);

        Assert.assertArrayEquals(
                new String[] {"Hugo", "henry", "bond",
                    "BerND", "ALFONS", "aaron"}, descCI);
    }
}
