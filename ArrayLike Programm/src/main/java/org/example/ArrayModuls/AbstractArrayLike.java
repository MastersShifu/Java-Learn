package org.example.ArrayModuls;

interface ArrayLikeInterface<E> {
    Object get(int index);
    void set(int index, Object object);
    void remove(int index);
    void add(int index, Object object);
}
