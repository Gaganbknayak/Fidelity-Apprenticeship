import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Details");
        System.out.println("Product ID: ");
        int id = scanner.nextInt();
        System.out.println("Product Name: ");
        String name = scanner.next();
        System.out.println("Product Category: ");
        String category = scanner.next();

        p1.initialize(id, name, category);
        p1.display();
        p1.show();
        }
        }