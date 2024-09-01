import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n : " );
        int n = in.nextInt();
        int finalAns = numberFactorial(n);
        System.out.print(finalAns);
    }

    static int numberFactorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * numberFactorial(n-1);

    }
}