public class CircularQueue {
    private static final int MAX_SIZE = 5; // Maximum size of the queue
    private int[] queueArray = new int[MAX_SIZE];
    private int front = -1; // Front of the queue
    private int rear = -1; // Rear of the queue
    private int count = 0; // Counter to keep track of the number of elements in the queue

    // Method to check if the queue is empty
    private boolean isEmpty() {
        return count == 0;
    }

    // Method to check if the queue is full
    private boolean isFull() {
        return count == MAX_SIZE;
    }

    // Method to enqueue (insert) an element into the queue
    private void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + element);
        } else {
            if (isEmpty()) {
                front = 0; // Set front to 0 if the queue is empty
            }
            rear = (rear + 1) % MAX_SIZE; // Circular increment for rear
            queueArray[rear] = element;
            count++;
            System.out.println(element + " enqueued to the queue");
        }
    }

    // Method to dequeue (remove) an element from the queue
    private void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
        } else {
            int dequeuedElement = queueArray[front];
            front = (front + 1) % MAX_SIZE; // Circular increment for front
            count--;
            System.out.println(dequeuedElement + " dequeued from the queue");
        }
    }

    // Method to display the elements in the queue
    private void displayQueue() {
        System.out.print("Queue: ");
        int i = front;
        for (int j = 0; j < count; j++) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % MAX_SIZE; // Circular increment for display
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue();

        // Enqueue elements
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);

        // Display the queue
        circularQueue.displayQueue();

        // Dequeue an element
        circularQueue.dequeue();

        // Display the updated queue
        circularQueue.displayQueue();
    }
}
