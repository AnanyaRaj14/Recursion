// **********************************  M-1  ***************************************

import java.util.Scanner;
public class increasing{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the vaue of n : " );
        int n = in.nextInt();
        printIncreasing(n);
    }

    static void printIncreasing(int n){
        if(n == 0){
            // System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(" " + n );
    }
}


// *******************************************  M-2  *******************************************
// import java.util.Scanner;
// public class increasing{
//     public static void main(String[] args){
//         print(1);
//     }

//     static void print(int n){
//         if(n == 10){
//             return;
//         }
//         System.out.println(n);
//         print(n+1);
//     }
// }


// ******************************  M-3 *******************************
// import java.util.Scanner;
// public class increasing{
//     public static void main(String[] args){
//         print(10);
//     }

//     static void print(int n){
//         if(n == 0){
//             return;
//         }
//         print(n-1);
//         System.out.println(n);    
//     }
// }
