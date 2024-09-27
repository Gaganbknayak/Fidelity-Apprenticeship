package Question4;

import java.util.Scanner;

public class Byte {
    private static final byte MAX_VALUE = 0x7f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Byte: ");
        byte b = sc.nextByte();
        System.out.println("Value of number: "+b);
        b = Byte.MAX_VALUE;
        System.out.println("Largest value stored in signed byte: "+b);
    }
}
