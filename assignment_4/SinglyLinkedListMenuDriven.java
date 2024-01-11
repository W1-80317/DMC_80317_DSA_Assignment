import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedListMenuDriven {
    private Node head;
    private Node tail;

    // Method to add a node at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to add a node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to delete the first node of the linked list
    public void delFirst() {
        if (head == null) {
            System.out.println("Linked list is empty. Cannot delete from an empty list.");
        } else {
            head = head.next;
            if (head == null) {
                // If the list becomes empty after deletion
                tail = null;
            }
        }
    }

    // Method to delete the last node of the linked list
    public void delLast() {
        if (head == null) {
            System.out.println("Linked list is empty. Cannot delete from an empty list.");
        } else {
            if (head == tail) {
                // If there is only one node in the list
                head = null;
                tail = null;
            } else {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
        }
    }

    // Method to display the elements of the linked list
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
        SinglyLinkedListMenuDriven linkedList = new SinglyLinkedListMenuDriven();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Node at the Beginning");
            System.out.println("2. Add Node at the End");
            System.out.println("3. Delete First Node");
            System.out.println("4. Delete Last Node");
            System.out.println("5. Display Linked List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter data for the new node: ");
                    int dataFirst = scanner.nextInt();
                    linkedList.addFirst(dataFirst);
                    System.out.println("Node added at the beginning.");
                    break;
                case 2:
                    System.out.print("Enter data for the new node: ");
                    int dataLast = scanner.nextInt();
                    linkedList.addLast(dataLast);
                    System.out.println("Node added at the end.");
                    break;
                case 3:
                    linkedList.delFirst();
                    System.out.println("First node deleted.");
                    break;
                case 4:
                    linkedList.delLast();
                    System.out.println("Last node deleted.");
                    break;
                case 5:
                    System.out.println("Linked List:");
                    linkedList.display();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}
