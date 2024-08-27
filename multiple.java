import java.util.Scanner;
public class multiple{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n : " );
        int n = in.nextInt();
        System.out.print("enter the value of k : " );
        int k = in.nextInt();
        numMultiple(n,k);
       
    }

    static void numMultiple(int n, int k ){
        if(k == 0) return ;

        numMultiple(n, k-1);
        System.out.println(n*k);

    }
}