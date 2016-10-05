package tpe.object.tostring;

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
}
