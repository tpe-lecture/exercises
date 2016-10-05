package tpe.object.equalshashcode;

/**
 * Ein Wesen in der Spielwelt.
 */
public class Wesen {

    /** Name des Wesens. */
    private String name;
    
    /** Stärke des Wesens.  */
    private int staerke;

    /**
     * Legt ein neues Wesen an.
     * 
     * @param name Name des Wesens.
     * @param staerke Stärke des Wesens.
     */
    public Wesen(String name, int staerke) {
        this.name = name;
        this.staerke = staerke;
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + staerke;
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
        Wesen other = (Wesen) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (staerke != other.staerke) {
            return false;
        }
        return true;
    }    
}
