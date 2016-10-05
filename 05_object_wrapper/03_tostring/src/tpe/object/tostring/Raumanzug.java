package tpe.object.tostring;

/**
 * Ein Raumanzug.
 */
public class Raumanzug implements Cloneable {

    /** Sauerstoffvorrat, der noch im Raumanzug ist. */
    private double sauerstoffVorrat;

    /** Hersteller des Raumanzuges. */
    private String hersteller;

    /**
     * Ertzeugt einen neuen Raumanzug.
     * @param hersteller Hersteller des Anzuges.
     */
    public Raumanzug(String hersteller) {
        this.hersteller = hersteller;
        sauerstoffVorrat = Math.random();
    }

    /**
     * Sauerstoffvorrat im Anzug.
     *
     * @return Vorrat in % (0.0-1.0)
     */
    public double getSauerstoffVorrat() {
        return sauerstoffVorrat;
    }

    /**
     * Tankt den Anzug auf.
     */
    public void auftanken() {
        sauerstoffVorrat = 1.0;
    }
}
