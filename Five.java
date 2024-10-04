//shift all 0 to right

import java.util.Arrays;
import java.util.Scanner;

public class Five {
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
        int[] arr = new int[num.length];
        int count = 0;
        int len = num.length-1;
        for (int i : num) {
            if (i == 0) {
                arr[len] = i;
                len--;
            } else {
                arr[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}