import java.util.Arrays;

public class ComparisonCountInLInerarBinary{

    // Linear Search
    public static int linearSearch(int[] array, int key) {
        int comparisons = 0;

        for (int i = 0; i < array.length; i++) {
            comparisons++;
            if (array[i] == key) {
                return comparisons;
            }
        }

        return comparisons;
    }

    // Binary Search
    public static int binarySearch(int[] array, int key) {
        int comparisons = 0;
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            comparisons++;

            if (array[mid] == key) {
                return comparisons;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return comparisons;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;

        // Linear Search
        int linearComparisons = linearSearch(sortedArray, key);
        System.out.println("Linear Search Comparisons: " + linearComparisons);

        // Binary Search
        int binaryComparisons = binarySearch(sortedArray, key);
        System.out.println("Binary Search Comparisons: " + binaryComparisons);
    }
}
