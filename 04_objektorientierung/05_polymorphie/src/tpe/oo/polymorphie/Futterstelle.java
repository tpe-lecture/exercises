package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;

/**
 * Fütterung der Tiere.
 */
public class Futterstelle {

    /**
     * Füttert den Affen.
     * 
     * @param affe Affe, der gefüttert werden soll. 
     */
    public void gibFutter(Affe affe) {
        affe.fuettern();
    }
    
    /**
     * Füttert den Gorilla.
     * 
     * @param gorilla Gorilla, der gefüttert werden soll. 
     */
    public void gibFutter(Gorilla gorilla) {
        gorilla.fuettern();
    }
    
    /**
     * Füttert die Giraffe.
     * 
     * @param giraffe Giraffe, die gefüttert werden soll. 
     */
    public void gibFutter(Giraffe giraffe) {
        giraffe.fuettern();
    }
}
