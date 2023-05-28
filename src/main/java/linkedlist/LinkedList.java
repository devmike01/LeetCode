package main.java.linkedlist;

import java.util.List;

public interface LinkedList<T> {
    void add(T value);

    int size();

    T get(int index);

    void set(int index, T value);

    List<T> toList();
}
