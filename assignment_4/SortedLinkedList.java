import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SortedLinkedList {
    private Node head;
    private Node tail;

    // Method to insert a new node in sorted order
    public void insertInSortedOrder(int newData) {
        Node newNode = new Node(newData);

        if (head == null || newData <= head.data) {
            // Insert at the beginning if the list is empty or the new data is smaller than the head
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                // If the list was empty, update the tail
                tail = newNode;
            }
            return;
        }

        Node current = head;
        while (current.next != null && newData > current.next.data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (newNode.next == null) {
            // If the new node is inserted at the end, update the tail
            tail = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedLinkedList sortedList = new SortedLinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert in Sorted Order");
            System.out.println("2. Display Linked List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter data for the new node: ");
                    int dataSorted = scanner.nextInt();
                    sortedList.insertInSortedOrder(dataSorted);
                    System.out.println("Node inserted in sorted order.");
                    break;
                case 2:
                    System.out.println("Linked List:");
                    sortedList.display();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}
