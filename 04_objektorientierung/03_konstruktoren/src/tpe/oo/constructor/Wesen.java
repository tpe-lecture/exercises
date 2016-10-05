package tpe.oo.constructor;

/**
 * Basisklasse für Spielfiguren.
 */
public class Wesen {

    /** Name der Spielfigur. */
    private String name;
    
    /**
     * Legt eine neue Spielfigur an.
     * 
     * @param name Name der Figur.
     */
    public Wesen(String name) {
        this.name = name;
    }
    
    /**
     * Gibt den Namen der Spielfigur zurück.
     * 
     * @return Name der Spielfigur.
     */
    public String getName() {
        return name;
    }
}
