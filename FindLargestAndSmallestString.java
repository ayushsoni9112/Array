//print the largest string and smallest string.

import java.util.Arrays;
import java.util.Scanner;

public class FindLargestAndSmallestString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:- ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter String "+(i+1));
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
        get(arr);
        sc.close();
    }
    public static void get(String[] arr) {
        String large = arr[0];
        String small = arr[0];
        for (String s : arr) {
            if (s.length() > large.length()) {
                large = s;
            } else if (s.length() < small.length()) {
                small = s;
            }
        }
        System.out.println("Largest string: "+large);
        System.out.println("Smallest string: "+small);
    }
}
