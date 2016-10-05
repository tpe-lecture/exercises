package tpe.object.clone;

/**
 * Ein Alien.
 */
public class Alien implements Cloneable {

    /** Name des Aliens. */
    private String name;

    /** Raumanzug des Aliens. */
    private Raumanzug raumanzug;

    /**
     * Erzeugt ein neues Alien.
     *
     * @param name Name des Aliens.
     * @param raumanzug Anzug.
     */
    public Alien(String name, Raumanzug raumanzug) {
        this.name = name;
        this.raumanzug = raumanzug;
    }

    /**
     * Gibt den Namen des Aliens zurück.
     *
     * @return Name des Aliens.
     */
    public String getName() {
        return name;
    }

    /**
     * Gibt den Anzug zurück.
     *
     * @return der Anzug.
     */
    public Raumanzug getAnzug() {
        return raumanzug;
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result
                + ((raumanzug == null) ? 0 : raumanzug.hashCode());
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
        Alien other = (Alien) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (raumanzug == null) {
            if (other.raumanzug != null) {
                return false;
            }
        }
        else if (!raumanzug.equals(other.raumanzug)) {
            return false;
        }
        return true;
    }
}
