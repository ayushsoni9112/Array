//Find the missing numbe from 1 to n

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNo {
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
        int len = num.length;
        int sum1 = ((len+1)*(len+2))/2;
        int sum2 = 0;
        for (int i : num) {
            sum2+=i;
        }
        System.out.println(sum1-sum2);
    }
}
