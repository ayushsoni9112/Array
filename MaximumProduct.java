//find the maximum product for any combination of two integers in a given array of positive integers.

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProduct {
    
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
        int product = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (i != j && n[i] * n[j] > product)
                    product = n[i] * n[j];
            }
        }
        System.out.println(product);
    }
}