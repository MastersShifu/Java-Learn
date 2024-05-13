package org.example;

import org.example.ArrayModuls.ArrayLike;

public class Main {
    public static void main(String[] args) {
        ArrayLike<String> list = new ArrayLike<>();
        list.add(0, "text");
        list.add(1, "text");
        list.remove(0);
        list.set(0, "test 2");
        System.out.println(list.get(1));
        System.out.println(list);
    }
}