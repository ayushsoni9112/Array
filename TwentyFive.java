//print and count all the prime numbers of the array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwentyFive {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:- ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter String "+(i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        get(arr);
        sc.close();
    }
    public static void get(int[] arr) {
        List<Integer> l = new ArrayList<>();
        int count = 0;
        for (int n : arr) {
            if (isPrime(n)) {
                l.add(n);
                count++;
            }
        }
        System.out.println(l);
        System.out.println("There are total " + count + " prime numbers in list.");
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}
