
import java.util.Scanner;
import java.util.function.BiConsumer;


public class P {

    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();

        for(int i =0; i < t; i++){
            int n = sc.nextInt();
            boolean flag = false;

            for(int j = 0; j < n; j++){
                System.out.println((int)Math.pow(2,i));
                if((int)Math.pow(2,i) == n && i % 2 != 0){

                    flag = true;
                }
                else flag = false;
            }
            if(flag){
                System.out.println(0);
            }
            else System.out.println(1);

        }
    }
}
//git add
//git commit
//git push