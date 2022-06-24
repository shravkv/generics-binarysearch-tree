package com.bridgelabz;

public class BinarySearchTree {
    Node root;

    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree program ");
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertionElements(56);
        binarySearchTree.insertionElements(30);
        binarySearchTree.insertionElements(70);
        binarySearchTree.sorting();
        binarySearchTree.toPrint();
    }

    public <T> void insertionElements(T data) {
        Node node = new Node(data);
        node.setData(data);
        node.setNext(root);
        root = node;
    }

    public <T> void sorting() {
        Node currentNode = root, index;
        while (currentNode != null) {
            index = currentNode.getNext();
            while (index != null) {
                if ((int) currentNode.getData() > (int) index.getData()) {
                    int temp = (int) currentNode.getData();
                    currentNode.setData(index.getData());
                    index.setData(temp);
                }
                index = index.getNext();
            }
            currentNode = currentNode.getNext();
        }

    }

    public void toPrint() {
        Node currentNode = root;
        while (currentNode != null) {
            currentNode.display();
            currentNode = currentNode.next;
        }
    }
}