package com.bridgelabz;

public class BinarySearchTree {
    Node root;

    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree program ");
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int[] data = {56, 30, 70, 22, 40, 11, 3, 16, 60, 95, 65, 63, 67};
        for (int i : data) {
            binarySearchTree.insertionElements(i);
        }
        binarySearchTree.sorting();
        binarySearchTree.toPrint();
        System.out.println();
        binarySearchTree.findingNode(63);
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

    public <T> void findingNode(T data) {
        Node currentNode = root;

        while (currentNode != null) {
            if (currentNode.data == data) {
                System.out.println("Element Found in the Tree :" + data);
            }
            currentNode = currentNode.next;
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