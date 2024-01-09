public class BinarySearchDescending {

    // Binary search in descending order
    static int binarySearchDescending(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                high = mid - 1; // Adjust the high pointer for descending order
            } else {
                low = mid + 1; // Adjust the low pointer for descending order
            }
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] descendingArray = {20, 15, 10, 8, 6, 5, 3, 2, 1};
        int key = 6;

        int index = binarySearchDescending(descendingArray, key);

        if (index != -1) {
            System.out.println("Key " + key + " found at index: " + index);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }
}
