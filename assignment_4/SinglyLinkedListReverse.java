import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedListReverse {
    private Node head;
    private Node tail;

    // ... (previous methods remain unchanged)

    // Method to display the elements of the linked list in reverse order
    public void displayReverse() {
        displayReverseHelper(head);
        System.out.println();
    }

    private void displayReverseHelper(Node current) {
        if (current == null) {
            return;
        }
        displayReverseHelper(current.next);
        System.out.print(current.data + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedListMenuDriven linkedList = new SinglyLinkedListMenuDriven();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert After a Node");
            System.out.println("2. Insert Before a Node");
            System.out.println("3. Display Linked List");
            System.out.println("4. Display Linked List in Reverse Order");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                // ... (previous cases remain unchanged)
                case 4:
                    System.out.println("Linked List in Reverse Order:");
                    linkedList.displayReverse();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
