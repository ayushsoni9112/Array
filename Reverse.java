//print each element of the array in reverse order.

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter String "+(i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        get(arr);
        sc.close();
    }
    public static void get(int[] arr) {
        for (int i = arr.length-1; i >= 0; i--)
            System.out.print(arr[i] + "   ");        
    }
}
