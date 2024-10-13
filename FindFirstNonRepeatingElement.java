//print the index and the value of the first non-repeating element in an array.

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstNonRepeatingElement {
    
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
        Integer op = get(num);
        if (op != null) {
            System.out.println("Value is " + op);
        } else {
            System.out.println("Every element is unique in Array");
        }
        sc.close();
    }
    public static Integer get(int[] n) {
        for (int i = 0; i < n.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < n.length; j++) {
                if (i != j && n[i] == n[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("Index is " + (i+1));
                return n[i];
            }
        }
        return null;
    }
}