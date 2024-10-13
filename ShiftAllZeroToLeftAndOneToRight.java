//shift all 0’s to left and all 1’s to the right(Without Sorting).

import java.util.Arrays;
import java.util.Scanner;

public class ShiftAllZeroToLeftAndOneToRight {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:- ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter value "+(i+1)+"(only 0 and 1)");
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        get(num);
        sc.close();
    }
    public static void get(int[] n) {
        int len = 0;
        for(int i = 0; i < n.length; i++) {
            if (n[i] == 0) {
                n[len] = n[i];
                len++;
            }
        }
        while (len < n.length) {
            n[len] = 1;
            len++;
        }
        System.out.println(Arrays.toString(n));
    }
}
