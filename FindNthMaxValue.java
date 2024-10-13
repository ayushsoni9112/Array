//nth max value

import java.util.Arrays;
import java.util.Scanner;

public class FindNthMaxValue {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:- ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter value "+(i+1));
            num[i] = sc.nextInt();
        }
        System.out.println("Enter nth value to sort");
        int n = sc.nextInt();
        for (int i: num) {
            System.out.print(i + "  ");
        }
        System.out.println();
        if (n <= num.length && n > 0) {
            get(num, n);
        } else {
            System.out.println("Invailed input");
        }
        sc.close();
    }
    public static void get(int[] num, int n) {
        Arrays.sort(num);
        System.out.println(num[num.length-n]);
    }
}