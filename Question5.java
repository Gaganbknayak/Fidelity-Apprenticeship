import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        checkAge(age);
    }
    public static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }
}
