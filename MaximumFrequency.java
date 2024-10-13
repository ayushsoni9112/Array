//print the element and its frequency which has appeared for the maximum time in the array.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumFrequency {
    
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
    public static void get(int[] n) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : n) {
            m.put(i, m.getOrDefault(i, 0)+1);
        }
        System.out.println(getMaxEntry(m));
    }
    public static Map.Entry<Integer, Integer> getMaxEntry(Map<Integer, Integer> map) {
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        return maxEntry;
    }
}