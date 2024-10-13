//print the Biggest element, Smallest element and their difference

import java.util.Arrays;
import java.util.Scanner;

public class FindDiffBetweenBiggestAndSmallestElement {
    
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
    public static void get(int[] num) {
        int big = 0;
        int small = Integer.MAX_VALUE;
        for(int i = 0; i < num.length; i++) {
            if (num[i] > big) {
                big = num[i];
            } else if (num[i] < small) {
                small = num[i];
            }
        }
        System.out.print("Biggest value is " + big + " and smallest value is " + small + " and there is difference of " + (big - small));
    }
}
