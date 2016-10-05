package tpe.nested.lambda;

/**
 * Interface, um Entscheidung über ein Objekt zu
 * treffen.
 *
 * @param <T> Typ des Objekts
 */
@FunctionalInterface
public interface Predicate<T> {

    /**
     * Entscheidet, ob ein Objekt akzeptiert wird oder nicht.
     *
     * @param object das zu untersuchende Objekt
     * @return {@code true} wenn das Objekt akzeptiert wird,
     *          andernfalls {@code false}.
     */
    boolean accept(T object);
}
