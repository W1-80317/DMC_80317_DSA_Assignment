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

    // Method to insert a new node after a given node
    public void insertAfter(Node targetNode, int newData) {
        if (targetNode == null) {
            System.out.println("Target node is null. Cannot insert after.");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = targetNode.next;
        targetNode.next = newNode;

        if (targetNode == tail) {
            tail = newNode;
        }
    }

    // Method to insert a new node before a given node
    public void insertBefore(Node targetNode, int newData) {
        if (targetNode == null || targetNode == head) {
            // If targetNode is null or the head, insert at the beginning
            addFirst(newData);
            return;
        }

        Node newNode = new Node(newData);
        Node current = head;

        // Traverse the list to find the node before the targetNode
        while (current != null && current.next != targetNode) {
            current = current.next;
        }

        if (current != null) {
            newNode.next = targetNode;
            current.next = newNode;
        }
    }

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
            System.out.println("1. Insert After a Node");
            System.out.println("2. Insert Before a Node");
            System.out.println("3. Display Linked List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter data for the new node: ");
                    int dataAfter = scanner.nextInt();
                    System.out.print("Enter data of the target node: ");
                    int targetDataAfter = scanner.nextInt();
                    Node targetNodeAfter = linkedList.findNode(targetDataAfter);
                    linkedList.insertAfter(targetNodeAfter, dataAfter);
                    System.out.println("Node inserted after the target node.");
                    break;
                case 2:
                    System.out.print("Enter data for the new node: ");
                    int dataBefore = scanner.nextInt();
                    System.out.print("Enter data of the target node: ");
                    int targetDataBefore = scanner.nextInt();
                    Node targetNodeBefore = linkedList.findNode(targetDataBefore);
                    linkedList.insertBefore(targetNodeBefore, dataBefore);
                    System.out.println("Node inserted before the target node.");
                    break;
                case 3:
                    System.out.println("Linked List:");
                    linkedList.display();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    // Helper method to find a node with a given data value
    private Node findNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null; // Node with the given data not found
    }
}
