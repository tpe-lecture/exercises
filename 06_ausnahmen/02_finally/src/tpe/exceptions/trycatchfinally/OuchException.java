package tpe.exceptions.trycatchfinally;

/**
 * Exception, die geworfen wird, wenn die Figur an den Rand
 * stößt.
 */
public class OuchException extends RuntimeException {

    /**
     * Neue Ausnahme.
     */
    public OuchException() {
    }

    /**
     * Neue Ausnahme mit Meldung.
     *
     * @param message Meldung.
     */
    public OuchException(String message) {
        super(message);
    }
}
