import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args){
        int[] arr = {3, 12, 15, 18, 31, 64, 97 ,142,};
        int target = 97;
        // Array.sort(arr);
        int ans = search(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int s, int e){
        // s=0; 
        // e =arr.length-1;
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target<arr[m]){
            return search(arr, target, 0, m-1);
        }
        return search(arr, target, m+1, e);
    }
}