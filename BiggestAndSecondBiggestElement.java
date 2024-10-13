//print Biggest and second biggest element of the array.

import java.util.Arrays;
import java.util.Scanner;

public class BiggestAndSecondBiggestElement {
    
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
        int big = n[0];
        int big2 = 0;
        for (int i : n) {
            if (i > big) {
                big2 = big;
                big = i;
            } else if (i != big && i > big2) {
                big2 = i;
            }
        }
        System.out.println("Biggest Value is " + big);
        System.out.println("Second Biggest Value is " + big2);
    }
}