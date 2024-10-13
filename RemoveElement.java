//remove an element from the certain position of the array.

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    
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
        int position = 3;
        
        int[] myArr = new int[arr.length - 1];
        for(int i = 0; i < myArr.length; i++) {
            if (i < position-1) {
                myArr[i] = arr[i];
            } else {
                myArr[i] = arr[i+1];
            }
        }

        System.out.println(Arrays.toString(myArr));
    }
}
