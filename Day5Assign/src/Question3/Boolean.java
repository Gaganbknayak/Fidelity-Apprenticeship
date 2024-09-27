package Question3;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter the x value: ");
        x = sc.nextInt();
        System.out.println("Enter the y value: ");
        y = sc.nextInt();
        boolean result = (x<y);
        System.out.println("The result of whether x is less than y is "+ result);


    }
}
