public class NthOccurrenceLinearSearch {

    // Linear search to find the nth occurrence of the key
    static int findNthOccurrence(int[] array, int key, int n) {
        int occurrenceCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                occurrenceCount++;

                if (occurrenceCount == n) {
                    return i; // Found the nth occurrence, return the index
                }
            }
        }

        return -1; // Nth occurrence not found
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 3, 7, 9, 3, 11, 3};
        int key = 3;
        int n = 2;

        int index = findNthOccurrence(array, key, n);

        if (index != -1) {
            System.out.println("Index of the " + n + "th occurrence of " + key + ": " + index);
        } else {
            System.out.println("The " + n + "th occurrence of " + key + " not found in the array.");
        }
    }
}
