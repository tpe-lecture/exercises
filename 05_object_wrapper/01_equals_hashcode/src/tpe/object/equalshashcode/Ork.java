package tpe.object.equalshashcode;

/**
 * Ork.
 */
public class Ork extends Wesen {

    /** Stärke der Orks. */
    private static final int ORK_STAERKE = 17;
    
    /** Zeigt an, ob der Ork gut oder böse ist. */
    @SuppressWarnings("unused")
    private boolean boese;
    
    /**
     * Legt einen neuen Ork an.
     * 
     * @param name Name des Orks.
     * @param boese zeigt an, ob der Ork gut oder böse ist
     */
    public Ork(String name, boolean boese) {
        super(name, ORK_STAERKE);
        this.boese = boese;        
    }    
}
