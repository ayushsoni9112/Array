//Bubble Sort

import java.util.*;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first Array:- ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter value "+(i+1) +" for first array");
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(get(num)));
        sc.close();
    }
    public static int[] get(int[] num) {
        int len = num.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        // System.out.println(Arrays.toString(num));
        return num;
    }
}