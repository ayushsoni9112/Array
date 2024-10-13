//print true if all the elements in the array are unique.

import java.util.Arrays;
import java.util.Scanner;

public class IsUnique {
    
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
        System.out.println(get(num));
        sc.close();
    }
    public static boolean get(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}