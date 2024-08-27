import java.util.Scanner;
public class alternateSignSum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : " );
        int n = in.nextInt();
        // System.out.print("enter the value of k : " );
        // int k = in.nextInt();
        int ans = alternateSum(n);
        System.out.print("Sum of the series : " + ans);
       
    }

    static int alternateSum(int n){
        if(n == 0) return 0;

        if(n%2==0){
            return alternateSum(n-1) -  n;
        }
        else{
            return alternateSum(n-1)  + n;
        }

    }
}