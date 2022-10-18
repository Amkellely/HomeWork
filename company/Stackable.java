package com.company;

public interface Stackable<T> {
    void push(T data);
    T peek();
    T pop();
    String toString();
    boolean isEmpty();
}
