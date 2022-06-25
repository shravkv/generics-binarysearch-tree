package com.bridgelabz;

public class BinarySearchTree {
    static Node root;

    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree program ");
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(56);
        binarySearchTree.add(30);
        binarySearchTree.add(70);
        System.out.println();
        System.out.println("InOrder Print is left-->root-->right:");
        binarySearchTree.inOrderPrint(root);
        System.out.println();
        System.out.println("PreOrder Print is root-->left-->right:");
        binarySearchTree.preOrderPrint(root);
        System.out.println();
        System.out.println("PostOrder Print is left-->right-->root:");
        binarySearchTree.postOrderPrint(root);
    }

    public <T> void insertElements(Node<T> root, T key) {
        if (root == null) {
            root = new Node<>(key);
        }
        if (key.compareTo(root.key) < 0) {
            root.left = insertElements(root.left, key);
        } else if (key.compareTo(root.key) > 0) {
            root.right = insertElements(root.right, key);
        }
        return root;
    }

    public void add(T key) {
        root = insertElements(root, key);
    }

    public void inOrderPrint(Node<T> node) {
        if (node != null) {
            inOrderPrint(node.left);
            System.out.print(node.key + " -->");
            inOrderPrint(node.right);

        }
    }

    public void preOrderPrint(Node<T> node) {
        if (node != null) {
            System.out.print(node.key + "-->");
            preOrderPrint(node.left);
            preOrderPrint(node.right);
        }
    }

    public void postOrderPrint(Node<T> node) {
        if (node != null) {
            preOrderPrint(node.left);
            preOrderPrint(node.right);
            System.out.print(node.key + "-->");
        }
    }
}
