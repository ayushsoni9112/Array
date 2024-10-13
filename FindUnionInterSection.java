//Find union inter-section

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindUnionInterSection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:- ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter value "+(i+1));
            num[i] = sc.nextInt();
        }
        System.out.println("Enter size of 2nd Array");
        int[] num2 = new int[sc.nextInt()];
        for(int i = 0; i < num2.length; i++) {
            System.out.println("Enter value "+(i+1));
            num2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(num2));
        get(num, num2);
        sc.close();
    }
    public static void get(int [] a, int [] b) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> s = new HashSet<>();
        for (int n : a) {
            setA.add(n);
        }
        for (int n : b) {
            if (setA.contains(n)) {
                s.add(n);
            }
        }
        System.out.println(s);
    }
}
