package Question2;

import java.util.Scanner;

public class SquareCube {
    static double findSquare(double num){
        return num*num;
    }
    static double findCube(double num){
        return num*num*num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num = sc.nextDouble();
        double square = findSquare(num);
        double cube = findCube(num);
        System.out.println("The square of "+ num + " is " + square);
        System.out.println("The cube of "+ num +" is " + cube);



    }
}
