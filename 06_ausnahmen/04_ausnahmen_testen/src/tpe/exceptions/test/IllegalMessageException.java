package tpe.exceptions.test;

/**
 * Ungültige Nachricht.
 */
public class IllegalMessageException extends Exception {

    /**
     * Legt eine neue Ausnahme an.
     */
    public IllegalMessageException() {
    }

    /**
     * Legt eine neue Ausnahme an.
     *
     * @param message die Nachricht.
     */
    public IllegalMessageException(String message) {
        super(message);
    }

    /**
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString() {
        return getMessage();
    }
}
