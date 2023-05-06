package practice.array;
import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {
        int arr[] ={1,323,53,4532,3,-13,21,423,54,55};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
