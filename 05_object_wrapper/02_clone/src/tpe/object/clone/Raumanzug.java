package tpe.object.clone;

/**
 * Ein Raumanzug.
 */
public class Raumanzug implements Cloneable {

    /** Sauerstoffvorrat, der noch im Raumanzug ist. */
    private double sauerstoffVorrat;

    /**
     * Ertzeugt einen neuen Raumanzug.
     */
    public Raumanzug() {
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

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(sauerstoffVorrat);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Raumanzug other = (Raumanzug) obj;
        if (Double.doubleToLongBits(sauerstoffVorrat) != Double
                .doubleToLongBits(other.sauerstoffVorrat)) {
            return false;
        }
        return true;
    }
}
