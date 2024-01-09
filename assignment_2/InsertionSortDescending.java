public class InsertionSortDescending {

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Original Array: " + Arrays.toString(array));

        insertionSortDescending(array);

        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(array));
    }

    static void insertionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Change the condition from (j >= 0 && arr[j] > key) to (j >= 0 && arr[j] < key)
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
