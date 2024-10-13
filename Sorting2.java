//print first half of the array elements in ascending order and second half of the elements in descending order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sorting2 {
    
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
    public static void get(int[] a) {
        Arrays.sort(a);
        int mid = a.length/2;
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            l1.add(a[i]);
        }
        for (int i = a.length - 1; i >= mid; i--) {
            l1.add(a[i]);
        }
        System.out.println(l1);
    }
}
