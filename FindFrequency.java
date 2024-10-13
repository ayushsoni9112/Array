//WAJP to print the frequency of each element of the array if all given elements are in range from 0 to 1000.

import java.util.Arrays;
import java.util.Scanner;

public class FindFrequency {
    
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
        int[] count = new int[1001];
        for (int i : n) {
            count[i]++;
        }
        for(int i = 0; i < count.length; i++){
            if (count[i] > 0) {
                System.out.println(i + "\t" + count[i]);
            }
        }
    }
}
