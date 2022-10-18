package com.company;

public class Queue<T> implements UniQueue<T>{
    private  Node<T> head;
    private Node<T> tail;

    Queue(){
        head = null;
        tail = null;
    }
    @Override
    public String toString(){
        return super.toString();
    }

    public boolean isEmpty() {
        return (head == null && tail == null);
    }

        public void addElement(T data){
            Node<T> newNode = new Node<>(T data);


            }
        }