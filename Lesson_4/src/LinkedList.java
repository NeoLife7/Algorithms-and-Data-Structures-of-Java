public interface LinkedList extends Iterable<Integer>{

    int removeFirst();

    void insertFirst(int value);

    boolean isEmpty();

    int getSize();

    void display();

    Integer getFirstElement();

    Item getFirstItem();

    boolean find(int value);

    boolean remove(int value);


}
