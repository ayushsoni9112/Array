//find first repeting number

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class FirstRepetingNo {
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
    public static String get(int[] num) {
        Set<Integer> s = new HashSet<>();
        for (int i : num) {
            if (s.contains(i)) {
                return "" + i;
            }
            s.add(i);
        }
        return "There are only unique values are present in Array";
    }
}
