import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        int finalAns = numberFibonacci(n);
        System.out.println(finalAns);
    }

    static int numberFibonacci(int n) {
        if (n == 0 || n==1) {
            return n;
        }

        int prev = numberFibonacci(n - 1);
        int prevToPrev = numberFibonacci(n - 2);
        int ans = prev + prevToPrev;
        return ans;
    }
}