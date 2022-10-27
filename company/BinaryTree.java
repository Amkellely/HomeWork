package com.company;

public interface BinaryTree<T> {
    boolean isEmpty();
    void add(T data);
    T findMindl();
    T findMax();
    void delete(T data);
    boolean contains(T data);
    void inorder();
}
