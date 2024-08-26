import java.util.Scanner;
public class increasing{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the vaue of n : " );
        int n = in.nextInt();
        printIncreasing(n);
    }

    static void printIncreasing(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        printIncreasing(n-1);
        System.out.print(" " + n );
    }
}