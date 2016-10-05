package tpe.oo.polymorphie.tiere;

/**
 * Ein Tier im Zoo.
 */
public class ZooTier {

    /** Zeigt an, ob das Tier hungrig ist. */
    private boolean hungrig = true;
    
    /** Name des Tiers. */
    private String name;
    
    /**
     * Legt ein neues Zootier an.
     * 
     * @param name Name des Tiers
     */
    public ZooTier(String name) {
        this.name = name;
    }
    
    /**
     * Gibt dem Tier futter.
     */
    public void fuettern() {
        hungrig = false;
    }
    
    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return name + ": Ich bin " + (hungrig ? "hungrig" : "satt") + "!";
    }
}
