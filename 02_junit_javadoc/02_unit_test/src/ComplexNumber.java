/**
 * Klasse, die eine komplexe Zahl repräsentiert. Sie unterstützt
 * grundlegende arithmetische Operationen.
 *
 *<p>
 * Neue Instanzen werden mit Hilfe des Konstruktors erzeugt und initialisiert.
 *
 * <pre>
 * ComplexNumber zahl = new ComplexNumber(1.0, 5.0);
 * </pre>
 *
 * Die Klasse erlaubt es, komplexe Zahlen zu addieren, subtrahieren,
 * multiplizieren und zu dividieren. Weiterhin kann auch noch der
 * Betrag bestimmt werden.
 * <p>
 * Objekte dieser Klasse sind immutable. Die Methoden verändern den Zustand des
 * Objektes nicht sondern geben ein neues Objekt zurück.
 *
 * @author Thomas Smits
 */
public class ComplexNumber {

    /** Real-Anteil der komplexen Zahl. */
    private double realAnteil;

    /** Imaginäranteil der komplexen Zahl. */
    private double imaginaerAnteil;

    /**
     * Erzeugt eine neue komplexe Zahl mit dem entsprechenden
     * Real- und Imaginäranteil.
     *
     * @param realAnteil Real-Anteil der Zahl
     * @param imaginaerAnteil Imaginär-Anteil der Zahl
     */
    public ComplexNumber(double realAnteil, double imaginaerAnteil) {
        this.realAnteil = realAnteil;
        this.imaginaerAnteil = imaginaerAnteil;
    }

    /**
     * Erzeugt eine neue komplexe Zahl mit einem Imaginär-Anteil von 0.0.
     *
     * @param realAnteil Real-Anteil der Zahl
     */
    public ComplexNumber(double realAnteil) {
        this(realAnteil, 0.0);
    }

    /**
     * Addiert die gegebene komplexe Zahl zu dieser und gibt das
     * Ergebnis als neue komplexe Zahl zurück.
     *
     * @param other die Zahl, die zu dieser addiert werden soll
     * @return das Ergebnis der Addition
     */
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.realAnteil + other.realAnteil,
                this.imaginaerAnteil + other.imaginaerAnteil);
    }

    /**
     * Addiert die gegebene reele Zahl zu dieser und gibt das
     * Ergebnis als neue komplexe Zahl zurück.
     *
     * @param other die Zahl, die zu dieser addiert werden soll
     * @return das Ergebnis der Addition
     */
    public ComplexNumber add(double other) {
        return add(new ComplexNumber(other));
    }

    /**
     * Subtrahiert die gegebene komplexe Zahl von dieser und gibt das
     * Ergebnis als neue komplexe Zahl zurück.
     *
     * @param other die Zahl, die von dieser subtrahiert werden soll
     * @return das Ergebnis der Subtraktion
     */
    public ComplexNumber subtract(ComplexNumber other) {
        return add(other.multiply(1));
    }

    /**
     * Subtrahiert die gegebene reele Zahl von dieser und gibt das
     * Ergebnis als neue komplexe Zahl zurück.
     *
     * @param other die Zahl, die von dieser subtrahiert werden soll
     * @return das Ergebnis der Subtraktion
     */
    public ComplexNumber subtract(double other) {
        return subtract(new ComplexNumber(other));
    }

    /**
     * Multipliziert diese komplexe Zahl mit der gegebenen und gibt das
     * Ergebnis als neue komplexe Zahl zurück.
     *
     * @param other die Zahl, die mit dieser multipliziert werden soll
     * @return das Ergebnis der Multiplikation
     */
    public ComplexNumber multiply(ComplexNumber other) {

        double r = this.realAnteil * other.realAnteil
                 - this.imaginaerAnteil * other.imaginaerAnteil;

        double i = this.realAnteil * other.imaginaerAnteil
                 + this.imaginaerAnteil * other.realAnteil;

        return new ComplexNumber(r, i);
    }

    /**
     * Multipliziert diese komplexe Zahl mit der gegebenen reelen Zahl und gibt
     * das Ergebnis als neue komplexe Zahl zurück.
     *
     * @param other die Zahl, die mit dieser multipliziert werden soll
     * @return das Ergebnis der Multiplikation oder {@literal null} wenn der die
     *         übergebenen Zahl 0 ist
     */
    public ComplexNumber multiply(double other) {
        return multiply(new ComplexNumber(other));
    }

    /**
     * Dividiert diese komplexe Zahl durch die gegebene Zahl und gibt das
     * Ergebnis als neue komplexe Zahl zurück.
     *
     * @param other die Zahl, durch die dividiert werden soll
     * @return das Ergebnis der Division oder {@literal null} wenn der
     *         Betrag der übergebenen Zahl 0 ist
     */
    public ComplexNumber divide(ComplexNumber other) {

        if (other.abs() == 0.0) {
            return null;
        }

        double n = other.realAnteil * other.realAnteil
                 + other.imaginaerAnteil * other.imaginaerAnteil;

        double r = (this.realAnteil * other.realAnteil
                         + this.imaginaerAnteil * other.imaginaerAnteil)
                 / n;

        double i = (this.imaginaerAnteil * other.realAnteil
                 - this.realAnteil * other.imaginaerAnteil)
                 / n;

        return new ComplexNumber(r, i);
    }

    /**
     * Dividiert diese komplexe Zahl durch die gegebene reele Zahl und gibt das
     * Ergebnis als neue komplexe Zahl zurück.
     *
     * @param other die Zahl, durch die dividiert werden soll
     * @return das Ergebnis der Division
     */
    public ComplexNumber divide(double other) {
        return divide(new ComplexNumber(other));
    }


    /**
     * Liefert den Betrag der komplexen Zahl.
     *
     * @return Betrag der komplexen Zahl.
     */
    public double abs() {
        return Math.sqrt(realAnteil * realAnteil
                + imaginaerAnteil * imaginaerAnteil);
    }

    /**
     * Liefert die konjugiert komplexe Zahl zu dieser.
     *
     * @return die konjugiert komplexe Zahl
     */
    public ComplexNumber conjugate() {
        return new ComplexNumber(this.realAnteil, this.imaginaerAnteil * -1);
    }

    /**
     * Berechnet die n-te Potenz dieser komplexen Zahl.
     *
     * @param n Potenz
     * @return n-te Potenz dieser Zahl
     */
    public ComplexNumber power(int n) {
        ComplexNumber result = this;

        for (int i = 0; i < n; i++) {
            result = result.multiply(this);
        }

        return result;
    }

    /**
     * Liefert den Real-Anteil der komplexen Zahl.
     *
     * @return Real-Anteil
     */
    public double getRealAnteil() {
        return realAnteil;
    }

    /**
     * Liefert den Imaginär-Anteil der komplexen Zahl.
     *
     * @return Imaginaer-Anteil
     */
    public double getImaginaerAnteil() {
        return imaginaerAnteil;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("(%.2f %s %.2fi)", realAnteil,
               imaginaerAnteil < 0.0 ? "-" : "+",
               Math.abs(imaginaerAnteil));
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(imaginaerAnteil);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(realAnteil);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ComplexNumber other = (ComplexNumber) obj;
        if (imaginaerAnteil != other.imaginaerAnteil) {
            return false;
        }
        if (realAnteil != other.realAnteil) {
            return false;
        }
        return true;
    }
}
