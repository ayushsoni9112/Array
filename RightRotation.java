//rotate all the elements of array k position to its right.

import java.util.Arrays;
import java.util.Scanner;

public class RightRotation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:- ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter value "+(i+1));
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the rotation position");
        int k = sc.nextInt();
        System.out.println(Arrays.toString(num));
        get(num, k);
        System.out.println(Arrays.toString(num));
        sc.close();
    }
    public static void get(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        if (k == 0) return;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
