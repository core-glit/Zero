public class DuplicateOccurance {
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 5, 3, 2};

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            // Count duplicates
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;  // mark as counted
                }
            }

            // Print if duplicate found
            if (count > 1) {
                System.out.println(arr[i] + " --> " + count + " times");
            }
        }
    }
}