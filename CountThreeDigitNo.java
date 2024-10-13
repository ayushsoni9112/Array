//print and count all the three digit numbers

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountThreeDigitNo {
    
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
        int count = 0;
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < num.length; i++) {
            if (num[i] >= 100 && num[i] < 1000) {
                l.add(num[i]);
                count++;
            }
        }
        System.out.println("There are total " + count + " three digit numbers.");
        System.out.println(l);
    }
}
