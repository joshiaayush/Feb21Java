package practice.array;
import java.util.Arrays;
import java.util.Scanner;
public class SumOfMaxMElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of students participated in exam :");
        int n = sc.nextInt();//No. of students participated in exam
        System.out.println("Enter total number of students who scored in exam :");
        int m = sc.nextInt();//Total no of students who scored in exam

        int arr[] = new int[n];//Marks of all students
        System.out.println("Enter array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if(n < m){
            System.out.println("Invalid input....");
        }
        else{
            Arrays.sort(arr);

            int max = arr[n-1];
            int max2 = arr[n-2];
            int max3 = arr[n-3];

            System.out.println("The addition is :"+(max + max2 + max3));
        }

    }
}
