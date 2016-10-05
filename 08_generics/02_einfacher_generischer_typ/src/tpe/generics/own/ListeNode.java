package tpe.generics.own;

/**
 * Interne Repräsentation der Knoten in der Liste.
 */
class ListeNode {

    /** Daten. */
    Object data;

    /** Referenz auf den nächsten Knoten. */
    ListeNode next;

    /**
     * Legt einen neuen Knoten an.
     *
     * @param data daten, die gespeichert werden
     */
    ListeNode(Object data) {
        this.data = data;
    }
}