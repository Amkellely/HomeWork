package com.company;

class Node<T>{
    T data;
    Node<T> left;
    Node<T> right;

    Node(T data){
        this.data = data;
               }
}

public class BST<T extends Comparable<T>> implements BinaryTree<T> {
    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void add(T data) {
        root = insert(root, data);
    }

    @Override
    public T findMindl() {
        return null;
    }

    private Node<T> insert(Node<T> root, T data) {
        if (isEmpty()) {
            return new Node<T>(data);
        } else if (data.compareTo(root.data) < 0) {
            root.left = insert(root.left, data);
        } else if (data.compareTo(root.data) > 0){
            root.right = insert(root.right, data);
                    }
        return root;
    }


    public T findMin(){
        Node<T> temp = findMind(root);
        return temp.data;
    }
    public Node<T> findMind(Node<T> root) {
        Node<T> curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    @Override
    public T findMax() {
        Node<T> curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.data;
    }

    @Override
    public void delete(T data) {
        root = delete(root, data);
    }

    private Node<T> delete(Node<T> root, T data) {
        if (isEmpty()) return root;
        if (data.compareTo(root.data) < 0) {
            root.left = delete(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = delete(root.right, data);
        } else if (root.left != null && root.right != null) {
            root.data = findMind(root.right).data;
            root.right = delete(root.right, root.data);
        } else {
            if (root.left != null) ;
            root = root.left;
            if (root.right != null) {
                root = root.right;
            } else
                root = null;
        }
        return root;
    }

    @Override
    public boolean contains(T data){
        return contains(root, data);
    }

    @Override
    public void inorder() {
        inorder(root);
    }
        private void inorder(Node<T> root){
        if(root==null)return;
        inorder(root.left);
            System.out.println(root.data + "");
            inorder(root.right);
        }
    private boolean contains(Node<T> root, T data) {
        if (root == null) {
            return false;
        } else if (data.compareTo(root.data) < 0) {
            return contains(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            return contains(root.right, data);
        } else {
            return true;
        }
    }
    void preorder(Node<T> root){
        if(root==null)return;
        System.out.println(root.data + "");
        preorder(root.left);
        preorder(root.right);
    }
}
