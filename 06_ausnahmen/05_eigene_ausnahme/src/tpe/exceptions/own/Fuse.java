package tpe.exceptions.own;

/**
 * Eine Sicherung im Stromkreis.
 */
public class Fuse {

    /** 16 Ampere-Sicherung. */
    public static final int A16 = 16;

    /** 25 Ampere-Sicherung. */
    public static final int A25 = 25;

    /** 32 Ampere-Sicherung. */
    public static final int A32 = 32;

    /** Strom, bei dem die Sicherung auslöst. */
    private final int tripCurrent;

    /**
     * Legt eine neue Sicherung an.
     *
     * @param tripCurrent Strom, bei dem die Sicherung auslösen soll.
     */
    public Fuse(int tripCurrent) {
        // TODO: Prüfen, ob es sich um einen gültigen Wert handelt
        // TODO: und ggf. eine Ausnahme werfen.
        this.tripCurrent = tripCurrent;
    }

    /**
     * Die Sicherung benutzen.
     *
     * @param current Strom, der durch die Sicherung fließt.
     */
    public void use(int current)  {
        // TODO: FuseTrippedException werfen, wenn der Strom
        // TODO: zu groß ist.
    }
}
