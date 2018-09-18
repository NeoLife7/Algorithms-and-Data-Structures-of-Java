public class ArrayImpl implements Array {

    private int currentSize;
    private int[] data;

    public ArrayImpl(int size) {
        this.currentSize = 0;
        this.data = new int[size];
    }

    @Override
    public int getElement(int index) {
        return data[index];
    }

    @Override
    public void setElement(int value, int index) {
        data[index] = value;
    }

    @Override
    public void addElement(int value) {
        data[currentSize] = value;
        currentSize++;
    }

    @Override
    public void display() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println(data[i]);
        }
    }

    @Override
    public int getSize() {
        return currentSize;
    }



    @Override
    public boolean deleteElement(int value) {
        int targetIndex = -1;
        for (targetIndex = 0; targetIndex < currentSize; targetIndex++) {
            if (data[targetIndex] == value)
                break;
        }

        if (targetIndex == -1 || targetIndex == currentSize)
            return false;

        for (int i = targetIndex; i < currentSize - 1; i++) {
            data[i] = data[i + 1];
        }

        currentSize--;

        return true;
    }
}
