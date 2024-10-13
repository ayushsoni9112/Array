//given array of Strings, print and count all the Strings which has even number of characters.

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class PrintAndCountEvenCharacterStrings {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:- ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        for(int i = 0; i < size; i++) {
            System.out.println("Enter String "+(i+1));
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
        get(arr);
        sc.close();
    }
    public static void get(String[] arr) {
        List<String> l = new ArrayList<>();
        int count = 0;
        for (String s : arr) {
            int len = s.length();
            if (len%2==0) {
                l.add(s);
                count++;
            }
        }
        System.out.println(l);
        System.out.println("There are total " + count + " Strings with even length.");
    }
}
