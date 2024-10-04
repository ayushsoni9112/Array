//Rotate array by one in left

import java.util.Arrays;
import java.util.Scanner;

public class Eight {
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
        int temp = num[0];
        int len = num.length;
        for(int i = 1; i < len; i++) {
            num[i-1] = num[i];
        }
        num[len-1] = temp;
        System.out.println(Arrays.toString(num));
    }
}
