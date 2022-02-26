package SingleLinkedList;

import java.util.Scanner;

public class LinkedList {
    Node start;

    public void insertAtBegin(int data) {
        Node temp = new Node(data);
        temp.next = start;
        start = temp;
    }

    public void insertAtEnd(int data) {
        Node p;
        Node temp = new Node(data);

        if (start == null) {
            start = temp;
            return;
        } else {
            p = start;
            while (p.next != null) {
                p = p.next;
            }
            p.next = temp;
        }
    }

    public void insertAfterData(int data, int DATA) {

        Node p = start;

        while (p != null) {
            if (p.data == DATA) {
                break;
            }
            p = p.next;
        }

        if (p == null) {
            System.out.println("Not Found in list");
        } else {
            Node temp = new Node(data);
            temp.next = p.next;
            p.next = temp;
        }
    }

    public void insertBeforeData(int data, int DATA) {

        if (start == null) {
            System.out.println("List is Empty");
            return;
        }

        if (DATA == start.data) {
            Node temp = new Node(data);
            temp.next = start;
            start = temp;
            return;
        }

        Node p = start;

        while (p != null) {
            if (p.next.data == DATA) {
                break;
            }
            p = p.next;
        }
            if (p == null) {
                System.out.println("Not Found in list");
            } else {
                Node temp = new Node(data);
                temp.next = p.next;
                p.next = temp;
            }
    }

    public void delFirst() {
//        if (start == null) {
//            return;
//        } else {
//            start = start.next;
//        }
        if (start == null) {
            return;
        } else if (start.next == null) {
            start = null;
            return;
        }
        Node p = start;
        while (p.next.next != null) {
            p = p.next;
        }
        p.next = null;
    }

    public void createList() {
        int i, n, data;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Nodes: ");
        n = sc.nextInt();

        for (i=0; i<n; i++) {
            System.out.print("Enter Element: ");
            data = sc.nextInt();
            insertAtEnd(data);
        }
    }

    public void displayList() {
        Node p = start;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }
}
