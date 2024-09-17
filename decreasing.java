// *****************************  M-1  ************************************
import java.util.Scanner;
public class decreasing{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n : " );
        int n = in.nextInt();
        printDecreasing(n);
    }
    static void printDecreasing(int n){
        if(n == 0){
            // System.out.print(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}





