/**
 * Class  IntList
 * @author AKPATA Kodjo Pierre
 */
public interface IntList {

    /**
     *
     * @return the head of the list
     */
    int getHead();

    /**
     *
     * @return the tail of the list
     */
    IntList getTail();

    /**
     *
     * @return true if the list is empty
     */
    boolean isEmpty();

    /**
     * this methode created the new List with the new element in head
     * @param n
     * @return the new List with the new element in head
     */
    IntList cons(int n);

    /**
     *
     * @return the length of the list
     */
    int length();

    /**
     *
     * @return the sum of the elements of the list
     */
    int sum();

    /**
     * this method test if two list is equal
     * @param list
     * @return true if current list is equal than the list passing into argument
     */
    boolean equals(IntList list);
}
