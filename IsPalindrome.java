//print true if elements of an array are same when it is read from front or from back otherwise print false.

import java.util.Arrays;
import java.util.Scanner;

public class IsPalindrome {
    
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
    public static boolean get(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            if (a[i] != a[a.length-1-i]) {
                return false;
            }
        }
        return true;
    }
}
