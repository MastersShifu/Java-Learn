package org.example.ArrayModuls;

public abstract class AbstractArrayLike<E> {

    protected AbstractArrayLike() {
    }

    public abstract Object get(int index);

    public abstract void set(int index, E e);

    public abstract void remove(int index);

    public abstract void add(int index, Object o);
}
