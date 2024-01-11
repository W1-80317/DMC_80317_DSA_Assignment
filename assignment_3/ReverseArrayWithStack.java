import java.util.Stack;

public class ReverseArrayWithStack {
    public static void main(String[] args) {
        // Create an array of integers
        int[] originalArray = {1, 2, 3, 4, 5};

        // Reverse the array using a stack
        int[] reversedArray = reverseArray(originalArray);

        // Print the original and reversed arrays
        System.out.println("Original Array: ");
        printArray(originalArray);

        System.out.println("\nReversed Array: ");
        printArray(reversedArray);
    }

    // Method to reverse an array using a stack
    private static int[] reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        for (int element : array) {
            stack.push(element);
        }

        // Pop elements from the stack to reverse the array
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        return array;
    }

    // Method to print an array
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
