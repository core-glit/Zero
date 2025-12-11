public class BubbleSort {
    public static void main(String[] args) {
        //input [3,3,5,5,7]
        //output 15 with bubble sort
        //remove duplicates and sum
        int[] arr = {3,3,5,5,7};
        
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) {  
            for (int j = 0; j < n - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) {  
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                sum += arr[i];
            }
        }
        
        System.out.println(sum); 
    }       
}
