
/**
 * Ein einfacher Taschenrechner.
 */
public class Rechner {

    /** Ergebnis des Taschenrechners. */
    public double wert;
    
    /** Speicher des Taschenrechners. */
    public double speicher;
    
    /**
     * Addiert zwei Wert und schreibt das Ergebnis 
     * in die Variable {@code wert}.
     * 
     * @param a erster Operand.
     * @param b zweiter Operand.
     */
    public void addiere(double a, double b) {
        wert = a + b;
    }

    /**
     * Subtrahiert zwei Wert und schreibt das Ergebnis 
     * in die Variable {@code wert}.
     * 
     * @param a erster Operand.
     * @param b zweiter Operand.
     */
    public void subtrahiere(double a, double b) {
        wert = a - b;
    }    

    /**
     * Multipliziert zwei Wert und schreibt das Ergebnis 
     * in die Variable {@code wert}.
     * 
     * @param a erster Operand.
     * @param b zweiter Operand.
     */
    public void multipliziere(double a, double b) {
        wert = a * b;
    }
    
    /**
     * Speichert den aktuellen Wert in der Variable {@speicher}.
     */
    public void speichern() {
        speicher = wert;
    }
}
