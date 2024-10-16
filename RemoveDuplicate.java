//remove the duplicate values from the array and store all unique elements

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class RemoveDuplicate {
    
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
        Set<Integer> s = new HashSet<>();
        for (int x : n) {
            s.add(x);
        }
        System.out.println(s);
    }
}