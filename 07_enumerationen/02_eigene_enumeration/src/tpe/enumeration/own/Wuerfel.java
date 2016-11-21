package tpe.enumeration.own;

import java.util.Random;

/**
 * Ein einfacher Würfel.
 */
public class Wuerfel {

    /** Zufallszahlengenerator. */
    private final Random rnd = new Random();

    private final WuerfelTyp typ;

    /**
     * Einen neuen Würfel anlegen.
     *
     * @param typ Typ des Würfels.
     */
    public Wuerfel(WuerfelTyp typ) {
        this.typ = typ;
    }

    /**
     * Den Würfel werfen.
     *
     * @return Ergebnis des Wurfes.
     */
    public int roll() {
        return rnd.nextInt(typ.getSeiten()) + 1;
    }
}
