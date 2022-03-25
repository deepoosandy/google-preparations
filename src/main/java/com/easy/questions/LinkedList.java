package com.easy.questions;

public class LinkedList {
    private Node head;

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addItem(Node node) {

        if (node == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }

    }

    public void printList() {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public Node findTheNthNodeFromTheLast(Node head, int n) {
        Node firstPointer = head;
        Node secondPointer = head;

        for (int i = 0; i < n; i++) {
            firstPointer = firstPointer.next;
        }
        while (firstPointer.next != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }
        return secondPointer;
    }

    public Node middleNode(Node head) {
        Node firstPointer = head;
        Node secondPointer = head;
        while (firstPointer != null) {

            firstPointer = firstPointer.next;
            if (secondPointer != null && firstPointer.next != null) {
                firstPointer = firstPointer.next;
                secondPointer = secondPointer.next;
            }
        }
        return secondPointer;
    }

    public Node reverseLinkedList(Node current) {
        Node previousNode = null;
        Node nextNode = null;
        int value = 0;
        while (current.next != null) {
            nextNode = current.next;
            current.next = previousNode;
            previousNode = current;
            current = nextNode;

        }
        return previousNode;
    }

    public boolean isPalandaram(Node head) {
        boolean flag = false;
        Node middle = middleNode(head);
        Node secondHalfHead = middle.next;

        middle.next = null;
        Node reversedLinkedList = reverseLinkedList(secondHalfHead);

       return false;
    }

}


