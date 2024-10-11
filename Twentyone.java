//swap two index values of the array.

import java.util.Arrays;
import java.util.Scanner;

public class Twentyone {
    
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
        int idx1 = 2;
        int idx2 = 3;
        
        int temp = arr[idx1];        
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
