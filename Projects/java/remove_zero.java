import java.util.*;
import java.lang.*;
import java.io.*;
public class remove_zero {

    public static void main(String[] args) {
        int []arr={1,0,2,0,0,3,4};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        System.out.println(count);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=arr[i+1];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}