//Reverse an Array

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:- ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter value "+(i+1));
            num[i] = sc.nextInt();
        }
        for (int i: num) {
            System.out.print(i + "  ");
        }
        System.out.println();
        get(num);
        sc.close();
    }
    public static void get(int[] num) {
        int left = 0; int right = num.length-1;
        for(int i = 0; i < num.length/2; i++) {
            int temp = num[right];
            num[right] = num[left];
            num[left] = temp;
            left++; right--;
        }
        for (int i: num) {
            System.out.print(i + "  ");
        }
    }
}
