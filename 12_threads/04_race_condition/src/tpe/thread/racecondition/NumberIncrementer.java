package tpe.thread.racecondition;

/**
 * Runnable, dass Zahlen inkrementieren kann.
 */
public class NumberIncrementer implements Runnable {

    /**
     * Zahl, bis zu der gearbeitet werden soll.
     */
    private final int boundary;

    /**
     * Speicher für die generierten Zahlen.
     */
    private final NumberList numberList;

    /**
     * Legt ein neues Objekt an.
     *
     * @param boundary Obergrenze für die Generierung
     * @param numberList Speicher für die Zahlen
     */
    public NumberIncrementer(int boundary, NumberList numberList) {
        this.boundary = boundary;
        this.numberList = numberList;
    }

    /**
     * @see java.lang.Runnable#run()
     */
    public void run() {
        for (int i = 0; i < boundary; i++) {
            int lastNum = numberList.getLastNumber();
            lastNum++;
            numberList.add(lastNum);
        }
    }
}
