package com.exercises.basics.part.one;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    // Root of Binary Tree
    Node root;
    BinaryTree() {
        root = null;
    }

    // Print the nodes of binary tree
    void printPreorder(Node node) {
        if (node == null) {
            return;
        }

        // Print data of node
        System.out.println(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printPreorder() {
        printPreorder(root);
    }

    // Driver method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(55);
        tree.root.left = new Node(21);
        tree.root.right = new Node(80);
        tree.root.left.left = new Node(9);
        tree.root.left.right = new Node(29);
        tree.root.right.left = new Node(76);
        tree.root.right.right = new Node(91);

        System.out.println("Preorder traversal of binary tree is: ");
        tree.printPreorder();
    }
}


public class Exercise125 {
    /**
     * 125. Write a Java program to get the preorder traversal of its nodes'
     * values of a given a binary tree.
     * Example:
     *     10
     *    / \
     *   20   30
     *  / \
     * 40   50
     *
     * Expected output: 10 20 40 50 30
     */
}
