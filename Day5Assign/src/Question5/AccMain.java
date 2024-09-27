package Question5;

import java.util.Scanner;

public class AccMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account type: ");
        String accType = sc.next();
        System.out.println();
        System.out.println("Enter account balance: ");
        double balance = sc.nextDouble();
        Account acc = new Account(id, accType, balance);
        System.out.println(acc.getDetails());

        System.out.println("Enter amout to withdraw: ");
        double amt = sc.nextDouble();
        if (acc.withdraw(amt)){
            System.out.println("New balance: " + acc.getBalance());
        }else {
            System.out.println("Insufficient Balance");
        }
    }
}
