package org.example.ArrayModuls;

public class ArrayLike<E> implements ArrayLikeInterface<E> {
    private Object[] array;
    private static final Integer INIT_ARRAY_CAPACITY = 10;

    public ArrayLike() {
        this.array = new Object[INIT_ARRAY_CAPACITY];
    }

    public Object get(int index) {
        return this.array[index];
    }

    public void set(int index, Object object) {
        this.array[index] = object;
    }

    public void remove(int index) {
        this.array[index] = null;
    }

    public void add(int index, Object object) {
        while (this.array.length < index) {
            Object[] tempArray = array.clone();
            this.array = new Object[(int) (tempArray.length * 1.5)];
            System.arraycopy(tempArray, 0, this.array, 0, tempArray.length);
        }

        this.array[index] = object;
    }

    @Override
    public String toString() {
        StringBuilder arrayToString = new StringBuilder("[");
        for (int i = 0; this.array.length > i; i++) {
            if (this.array[i] != null) {
                arrayToString.append(this.array[i]);
                if (this.array[i + 1] != null) {
                    arrayToString.append(", ");
                }
            }
        }

        arrayToString.append("]");

        return arrayToString.toString();
    }
}
