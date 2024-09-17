import java.util.Scanner;
public class gcd{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x = in.nextInt();
        System.out.print("Enter the value of y:");
        int y = in.nextInt();
        int ans =  gcd(x,y);
        System.out.print(ans);

    }
    static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y, x%y);
    }
}
