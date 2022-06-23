package com.bridgelabz;


public class Node<T> {
    Node next;
    T data;

    public Node(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void display() {
        System.out.print(data + " -->");
    }
}

