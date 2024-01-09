public class LinearSearchLastOccurrence {

    public static int linearSearchLastOccurrence(int[] array, int key) {
        if (array == null || array.length == 0) {
            return -1; // Return -1 for empty array or null input
        }

        int lastIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                lastIndex = i;
            }
        }

        return lastIndex;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 3, 11, 3, 13};
        int key = 3;

        int lastIndex = linearSearchLastOccurrence(array, key);

        if (lastIndex != -1) {
            System.out.println("Last occurrence of " + key + " is at index: " + lastIndex);
        } else {
            System.out.println(key + " not found in the array.");
        }
    }
}