import java.util.Iterator;

public class LinkedListIterator implements Iterator<Integer> {

    private LinkedList list;
    private boolean firstIterate = true;

    private Item current;

    public LinkedListIterator(LinkedList list) {
        this.list = list;

    }

    @Override
    public boolean hasNext() {
        if(firstIterate) {
            firstIterate = false;
            return list.getFirstElement() != null;
        } else {
            return current.getNextItem() != null;
        }
    }

    @Override
    public Integer next() {
        if(current == null) {
            current = list.getFirstItem();
        } else {
            current = current.getNextItem();
        }
        return current.getValue();
    }

    @Override
    public void remove() {
        list.remove(current.getValue());
    }
}
