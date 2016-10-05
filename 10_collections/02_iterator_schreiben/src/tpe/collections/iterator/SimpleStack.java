package tpe.collections.iterator;

/**
 * Eine einfache, naive Stack Implementierung.
 *
 * @param <T> Typ, der gespeichert werden soll.
 */
public class SimpleStack<T> {
// TODO: implements Iterable<T> hinzufügen

    private T[] stack;
    private int pos;

    /**
     * Legt einen neuen Stack mit der gegebenen Größe an.
     *
     * @param size Größe des Stacks.
     */
    @SuppressWarnings("unchecked")
    public SimpleStack(int size) {
        stack = (T[]) new Object[size];
        pos = 0;
    }

    /**
     * Fügt dem Stack ein neues Element hinzu.
     *
     * @param o Element, das hinzugefügt werden soll.
     */
    public void push(T o) {
        stack[pos++] = o;
    }

    /**
     * Holt das oberste Element und entfernt es.
     *
     * @return das oberste Element
     */
    public T pop() {
        return stack[--pos];
    }

    /**
     * Gibt das oberste Element zurück, ohne es zu entfernen.
     *
     * @return das oberste Element
     */
    public T peek() {
        return stack[pos - 1];
    }

    // TODO: Interface Iterable<T> implementieren
}
