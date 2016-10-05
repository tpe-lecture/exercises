package tpe.oo.singleton;

/**
 * Klasse, die den Superhelden Batman repräsentiert.
 */
public class Batman {
    
    /** Flag, das anzeigt, ob Batman seinen Batsuit an hat. */
    private boolean batsuitAngezogen;
    
    /**
     * Erzeugt einen neune Batman.
     */
    public Batman() {
        // Frisch geschaffene Batman tragen keine Suit
        batsuitAngezogen = false;
    }
    
    /**
     * Bat man zieht sich in seiner Batcave um.
     */
    public void umziehen() {
        batsuitAngezogen = !batsuitAngezogen;
    }
    
    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {     
        return "Batman " + (batsuitAngezogen ? "mit" : "ohne") + " Batsuit";
    }
}
