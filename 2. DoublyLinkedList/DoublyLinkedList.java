package DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int length() {
        return this.length;
    }

    public void displayForward() {
        if (head == null) {
            // just exits out of the method at this statement
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        if (tail == null) {
            return;
        }
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.prev;
        }
        System.out.println("null");
    }

    public void insertAtTheBegin(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;

        }
        newNode.prev = tail;
        tail = newNode;
    }

    public Node deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        Node temp = head;
        if (head == tail) {
            tail = null;
        }

        head = head.next;
        head.prev = null;
        temp.next = null;
        return temp;
    }

    public Node deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        Node temp = tail;
        if (head == tail) {
            head = null;
        }

        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        return temp;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertEnd(1);
        dll.insertEnd(2);
        dll.insertEnd(3);
        dll.insertEnd(4);
        dll.insertEnd(5);

        dll.displayForward();

        System.out.println(dll.deleteFirst().data);
        dll.displayForward();

        System.out.println(dll.deleteLast().data);
        dll.displayForward();
    }
}
