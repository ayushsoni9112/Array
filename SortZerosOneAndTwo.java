//sort 0’s, 1’s and 2’s whithout sorting

import java.util.Arrays;
import java.util.Scanner;

public class SortZerosOneAndTwo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:- ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter value "+(i+1)+"(only 0 and 1 and 2)");
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        get(num);
        sc.close();
    }
    public static void get(int[] n) {
        int[] num = new int[n.length];
        int len = 0;
        for(int i = 0; i < n.length; i++) {
            if (n[i] == 0) {
                num[len] = n[i];
                len++;
            }
        }
        for(int i = 0; i < n.length; i++) {
            if (n[i] == 1) {
                num[len] = n[i];
                len++;
            }
        }
        while (len < n.length) {
            num[len] = 2;
            len++;
        }
        System.out.println(Arrays.toString(num));
    }
}
