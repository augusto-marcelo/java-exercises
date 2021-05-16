package com.exercises;

public class Exercise121 {
    /**
     * 121. Write a Java program to reverse a given linked list.
     * Example: For linked list 20->40->60->80, the reversed linked list is 80->60->40->20
     */
}

class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node nextNode;

        Node(int d) {
            data = d;
            nextNode = null;
        }
    }

    /* Reverse the linked list */
    Node reverse(Node node) {
        Node prevNode = null;
        Node currentNode = node;
        Node nextNode = null;

        while(currentNode != null) {
            nextNode = currentNode.nextNode;
            currentNode.nextNode = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        node = prevNode;
        return node;
    }

    void printList(Node node) {
        while(node != null) {
            System.out.println(node.data + " ");
            node = node.nextNode;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(20);
        list.head.nextNode = new Node(40);
        list.head.nextNode.nextNode = new Node(60);
        list.head.nextNode.nextNode.nextNode = new Node(80);

        System.out.println("Original Linked list: ");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed Linked list:");
        list.printList(head);
    }

}
