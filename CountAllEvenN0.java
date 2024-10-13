//count all the even numbers

import java.util.Arrays;
import java.util.Scanner;

public class CountAllEvenN0 {
    
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
        System.out.println("There are totale " + get(num) + " even numbers.");
        sc.close();
    }
    public static int get(int[] num) {
        int count = 0;
        for(int i = 0; i < num.length; i++) {
            if (num[i]%2==0) {
                count++;
            }
        }
        return count;
    }
}
