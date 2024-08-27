import java.util.Scanner;
public class power{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of p : " );
        int p = in.nextInt();
        System.out.print("enter the value of q : " );
        int q = in.nextInt();
        int finalAns = numPower(p,q);
        System.out.print(finalAns);
    }

    static int numPower(int p, int q){
        if(q == 0) return 1;

      

        return numPower(p, q-1) * p;

    }
}