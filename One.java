//Find min and max value


import java.util.Arrays;
import java.util.Scanner;
public class One {
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
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:num) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Max value is " + max);
        System.out.println("min value is " + min);
    }
}