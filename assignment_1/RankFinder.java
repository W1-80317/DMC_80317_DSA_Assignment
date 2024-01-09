public class RankFinder {

    static int[] ranks;

    // Function to update the rank array and find the rank
    static int findRank(int[] stream, int element) {
        int rank = 0;

        // Update the rank array
        for (int i = 0; i < stream.length; i++) {
            if (stream[i] <= element) {
                rank++;
            }
        }

        return rank;
    }

    public static void main(String[] args) {
        int[] stream = { 10, 20, 15, 3, 4, 4, 1 };

        // Initialize the ranks array
        ranks = new int[stream.length];

        for (int i = 0; i < stream.length; i++) {
            int rank = findRank(stream, stream[i]);
            ranks[i] = rank;
            System.out.println("Rank of " + stream[i] + " is: " + rank);
        }
    }
}
