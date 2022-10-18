package com.company;

interface Queue<T> {
    boolean isEmpty();
    void addElement(T data);
    T removeElement();
    T peekFirst();

}
