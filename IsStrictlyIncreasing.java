//check if an array is strictly increasing.

import java.util.Arrays;
import java.util.Scanner;

public class IsStrictlyIncreasing {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:- ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter value "+(i+1));
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        System.out.println(get(num));
        sc.close();
    }
    public static String get(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] >= a[i+1]) {
                return "Array is not strictly increasing";
            }
        }
        return "Array is strictly increasing";
    }
}
