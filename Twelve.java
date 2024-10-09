//print the even index elements

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Twelve {

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
    public static List<Integer> get(int[] num) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < num.length; i++) {
            if (i%2==0) {
                l.add(num[i]);
            }
        }
        return l;
    }    
}