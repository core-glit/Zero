
public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6}; // Example array
        int n = 6; // Range from 1 to n

        // Create a boolean mark array
        boolean[] present = new boolean[n + 1];

        // Mark numbers that exist
        for (int num : arr) {
            present[num] = true;
        }

        // Print missing numbers
        System.out.println("Missing numbers:");
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.println(i);
            }
        }
    }
}