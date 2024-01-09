public class SelectionSort {

    // Selection sort function that returns the number of comparisons
    static int selectionSort(int[] array) {
        int comparisons = 0;
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        return comparisons;
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        int comparisons = selectionSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Number of comparisons: " + comparisons);
    }
}
