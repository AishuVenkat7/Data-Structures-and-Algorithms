package SinglyLinkedList;

public class SinglyLinkedList {

    private Node head; // holds the complete list

    // node creation
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //
    public int lenght() {
        if (head == null)
            return 0;
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");

    }

    public void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");

    }

    public void insertAtTheBegin(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtTheEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    public void insertAtaPosition(int value, int position) {
        Node newNode = new Node(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {

            int count = 1;
            Node prev = head;
            while (count < position - 1) {
                prev = prev.next;
                count++;
            }
            Node current = prev.next;
            newNode.next = current;
            prev.next = newNode;
        }
    }

    public Node deleteFirstElement() {
        if (head == null)
            return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;

    }

    public Node deleteLastElement() {
        if (head == null || head.next == null)
            return head;
        Node current = head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        return current;
    }

    public void deleteFromaPosition(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            Node prev = head;
            int count = 1;
            while (count < position - 1) {
                prev = prev.next;
                count++;
            }
            Node current = prev.next;
            prev.next = current.next;
        }
    }

    public boolean search(int key) {
        if (head == null)
            return false;
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public Node reverse() {
        if (head == null)
            return head;
        Node current = head;
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public Node getMiddleNode() {
        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public Node getNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }

        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value: n = " + n);
        }

        Node mainPtr = head;
        Node endPtr = head;

        int count = 0;

        while (count < n) {
            if (endPtr == null) {
                throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
            }
            endPtr = endPtr.next;
            count++;
        }

        while (endPtr != null) {
            endPtr = endPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public Node removeNthFromEnd(int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node endPtr = dummy, mainPtr = dummy;
        int count = 0;
        while (count < n) {
            if (endPtr == null) {
                throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
            }
            endPtr = endPtr.next;
            count++;
        }

        Node temp = null;
        while (endPtr != null) {
            endPtr = endPtr.next;
            temp = mainPtr;
            mainPtr = mainPtr.next;
        }

        temp.next = mainPtr.next;
        return dummy.next;
    }

    public Node insertInSortedList(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            return newNode;
        }

        Node current = head;
        Node temp = null;

        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        temp.next = newNode;
        newNode.next = current;
        return head;
    }

    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();

        // // creating a new node
        // sll.head = new Node(10);
        // Node secondNode = new Node(20);
        // Node thirdNode = new Node(30);
        // Node fourthNode = new Node(40);

        // // now we will connect the nodes together to form a chain
        // // headNode -> secondNode -> thirdNode
        // sll.head.next = secondNode; // 10 -> 20
        // secondNode.next = thirdNode; // 10 -> 20 -> 30
        // thirdNode.next = fourthNode; // 10 -> 20 -> 30 -> 40

        // // display linkedlist
        // sll.print();

        // =========================================================

        // // insert at the beginning
        // sll.insertAtTheBegin(1);
        // sll.insertAtTheBegin(2);
        // sll.insertAtTheBegin(3);

        // sll.print();

        // insert at the end
        sll.insertAtTheEnd(20);
        sll.insertAtTheEnd(40);
        sll.insertAtTheEnd(50);

        sll.print();

        sll.insertAtaPosition(10, 1);
        sll.insertAtaPosition(30, 3);

        sll.print();

        // =========================================================

        // // Delete the first node
        // System.out.println(sll.deleteFirstElement().data);
        // sll.print();

        // // delete the last node
        // System.out.println(sll.deleteLastElement().data);
        // sll.print();

        // // delete a node from the given postion
        // sll.deleteFromaPosition(2);
        // sll.print();

        // =========================================================

        // // find or search an element
        // int key = 2000;
        // if (sll.search(key)) {
        // System.out.println("element " + key + " is found");
        // } else {
        // System.out.println("element " + key + " is not found");
        // }

        // =========================================================

        // // Reverse a Singly linkedlist
        System.out.println(sll.head.data);
        Node reverseListHead = sll.reverse();
        System.out.println(reverseListHead.data);
        sll.display(reverseListHead);

        // =========================================================

        // // Find the middle node
        // System.out.println(sll.getMiddleNode().data);
        // // to check for even nuumber of nodes
        // sll.insertAtTheEnd(60);
        // sll.print();
        // System.out.println(sll.getMiddleNode().data);

    }
}