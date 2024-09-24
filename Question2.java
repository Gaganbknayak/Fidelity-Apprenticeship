import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int pizza = 200;
        int puff = 40;
        int pep = 120;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pizzas: ");
        int numPizzas = sc.nextInt();

        System.out.println("Enter puffs: ");
        int numPuffs = sc.nextInt();

        System.out.println("Enter peps: ");
        int numPeps = sc.nextInt();

        int totCostPizza = numPizzas * pizza;
        int totCostPuff = numPuffs * puff;
        int totCostPep = numPeps * pep;

        int total = totCostPizza + totCostPuff + totCostPep;
        System.out.println("Bill Details");
        System.out.println("Total Cost of pizza : " + totCostPizza);
        System.out.println("Total Cost of puff : " + totCostPuff);
        System.out.println("Total Cost of pep : " + totCostPep);
        System.out.println("Total Billing: " + total);
    }
}
