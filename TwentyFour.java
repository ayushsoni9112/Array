//check no is even or odd without using if else/Conditional Operator statement .

import java.util.Scanner;

public class TwentyFour {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        System.out.println(get(n));
        sc.close();
    }
    public static String get(int n) {        
        String[] arr = {"Even","Odd"};
        return arr[n%2];
    }
}
