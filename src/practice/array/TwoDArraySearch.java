package practice.array;

import java.util.Scanner;

public class TwoDArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns");
        int m = sc.nextInt();

        int [][] arr = new int[n][m];


        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                System.out.println("Enter element at "+i+", "+j+" location");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter a number to  be found :");
        int search = sc.nextInt();

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == search){
                    System.out.println("The element is at : "+i +","+ j);
                }
            }
        }
    }
}
