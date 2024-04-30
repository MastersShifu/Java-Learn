package org.example.ArrayModuls;

public class ArrayLike<E> extends AbstractArrayLike<E> {
    private Object[] array;

    public ArrayLike() {
        this.array = new Object[10];
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public void set(int index, Object o) {
        array[index] = o;
    }

    @Override
    public void remove(int index) {
        array[index] = null;
    }

    @Override
    public void add(int index, Object o) {
        while (array.length < index) {
            Object[] tempArray = array.clone();
            array = new Object[(int) (tempArray.length * 1.5)];
            System.arraycopy(tempArray, 0, array, 0, tempArray.length);
        }

        array[index] = o;
    }

    @Override
    public String toString() {
        StringBuilder arrayToString = new StringBuilder("[");
        for (int i = 0; array.length > i; i++) {
            if (array[i] != null) {
                arrayToString.append(array[i]);
                if (array[i + 1] != null) {
                    arrayToString.append(", ");
                }
            }
        }
        arrayToString.append("]");

        return arrayToString.toString();
    }
}
