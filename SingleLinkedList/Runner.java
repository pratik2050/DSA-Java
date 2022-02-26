package SingleLinkedList;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int x=1, data, DATA;

        LinkedList list = new LinkedList();

        Scanner sc = new Scanner(System.in);

        list.createList();
        System.out.println("List has been created");
        list.displayList();
        System.out.println();

        while (x != 0) {
            System.out.println();
            System.out.println("=======Singly Linked List Program=======");
            System.out.println("1. Add at the Beginning");
            System.out.println("2. Add at the End");
            System.out.println("3. Insert After a Data");
            System.out.println("4. Insert Before a Data");
            System.out.println("5. Display List");
            System.out.println("6. Delete First Node");
            System.out.println("0. Exit Program");
            System.out.println();
            System.out.print("ENTER YOUR CHOICE: ");

            x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.print("Enter Element: ");
                    data = sc.nextInt();
                    list.insertAtBegin(data);
                    break;
                case 2:
                    System.out.print("Enter Element: ");
                    data = sc.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 3:
                    System.out.println("Enter Data to insert: ");
                    data = sc.nextInt();
                    System.out.println("Enter data after which it should be inserted: ");
                    DATA = sc.nextInt();
                    list.insertAfterData(data,DATA);
                    break;
                case 4:
                    System.out.println("Enter Data to insert: ");
                    data = sc.nextInt();
                    System.out.println("Enter data before which it should be inserted: ");
                    DATA = sc.nextInt();
                    list.insertBeforeData(data, DATA);
                    break;
                case 5:
                    System.out.println();
                    list.displayList();
                    break;
                case 6:
                    list.delFirst();
                    list.displayList();
                    break;
                case 0:
                    break;
            }

        }
    }
}
