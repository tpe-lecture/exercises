package tpe.oo.finals;

/**
 * B-Klasse.
 */
public class B extends A {

    /**
     * Subtrahiert zwei Zahlen. Wenn das Ergebnis kleiner ist als
     * der Wert von <code>KONSTANTE</code>, dann wird das
     * Vorzeichen umgekehrt.
     *
     * @param a erster Wert
     * @param b zweiter Wert
     * @return Ergebnis
     */
    public static int sub(int a, int b) {
        int result = a + b;

        return (result < KONSTANTE) ? (result * -1) : (result);
    }
}
