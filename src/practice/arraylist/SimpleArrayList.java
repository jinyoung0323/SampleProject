package practice.arraylist;

public class SimpleArrayList<T> {
    private int size;
    private Object[] elementData = new Object[5];

    public void add(T value) {
        elementData[size++] = value;
    }

    public T get(int idx) {
        return (T)elementData[idx];
    }
}
