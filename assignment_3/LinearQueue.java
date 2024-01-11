public class LinearQueue {
    private static final int MAX_SIZE = 5; // Maximum size of the queue
    private int[] queueArray = new int[MAX_SIZE];
    private int front = 0;
    private int rear = 0;

    // Method to check if the queue is empty
    private boolean isEmpty() {
        return front == rear;
    }

    // Method to check if the queue is full
    private boolean isFull() {
        return rear == MAX_SIZE;
    }

    // Method to enqueue (insert) an element into the queue
    private void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + element);
        } else {
            queueArray[rear++] = element;
            System.out.println(element + " enqueued to the queue");
        }
    }

    // Method to dequeue (remove) an element from the queue
    private void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
        } else {
            int dequeuedElement = queueArray[front++];
            System.out.println(dequeuedElement + " dequeued from the queue");
        }
    }

    // Method to display the elements in the queue
    private void displayQueue() {
        System.out.print("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinearQueue linearQueue = new LinearQueue();

        // Enqueue elements
        linearQueue.enqueue(10);
        linearQueue.enqueue(20);
        linearQueue.enqueue(30);

        // Display the queue
        linearQueue.displayQueue();

        // Dequeue an element
        linearQueue.dequeue();

        // Display the updated queue
        linearQueue.displayQueue();
    }
}
