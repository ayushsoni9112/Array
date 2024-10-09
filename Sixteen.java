//print sum and average of all the elements

import java.util.Arrays;
import java.util.Scanner;

public class Sixteen {
    
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
        double sum = 0;
        for(int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        System.out.print("Total sum is " + sum + " and average = ");
        System.out.printf("%.2f",sum/num.length);
    }
}
