import java.util.Scanner;
public class countDigit{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. : " );
        int n = in.nextInt();
        int finalAns = digitCount(n);
        System.out.print(finalAns);
    }

    static int digitCount(int n){
        if(n>=1 && n<9) return 1;
      
        // int smallAns = numberFactorial(n-1);
        // int ans = n * smallAns;
        // return ans;

        return  digitCount(n/10) +1;

    }
}