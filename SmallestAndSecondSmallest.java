//print Smallest and second Smallest element of the array.

import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndSecondSmallest {
    
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
        get(num);
        sc.close();
    }
    public static void get(int[] n) {
        int small = n[0];
        int small2 = Integer.MAX_VALUE;
        for (int i : n) {
            if (i < small) {
                small2 = small;
                small = i;
            } else if (i != small && i < small2) {
                small2 = i;
            }
        }
        System.out.println("Smallest Value is " + small);
        System.out.println("Second Smallest Value is " + small2);
    }
}