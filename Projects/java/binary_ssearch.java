import java.util.Scanner;

public class binary_ssearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = sc.nextInt();
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start+(end-start) / 2; //Find the middle element of the array
            if (array[mid] == target) {
                System.out.println("Target found at index " + mid);
                break;
            } else if (array[mid] < target) { 
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}