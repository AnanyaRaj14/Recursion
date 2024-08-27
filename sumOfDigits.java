import java.util.Scanner;
public class sumOfDigits{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int n = in.nextInt();
        int ans = digitSum(n);
        System.out.print("The sum of the given no. is : " + ans);
    }

    static int digitSum(int n){
        if(n>=0 && n<=9) return n;
        return digitSum(n/10) + n%10;
    }
}