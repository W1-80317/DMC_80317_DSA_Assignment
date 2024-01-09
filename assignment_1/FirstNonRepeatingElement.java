public class FirstNonRepeatingElement {

    // Function to find the first non-repeating element
    static int findFirstNonRepeating(int[] array) {
        int[] countArray = new int[256]; // Assuming ASCII characters

        // Count the occurrences of each element
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }

        // Find the first non-repeating element
        for (int i = 0; i < array.length; i++) {
            if (countArray[array[i]] == 1) {
                return array[i];
            }
        }

        return -1; // No non-repeating element found
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};

        int result = findFirstNonRepeating(array);

        if (result != -1) {
            System.out.println("The first non-repeating element is: " + result);
        } else {
            System.out.println("No non-repeating element found in the array.");
        }
    }
}
