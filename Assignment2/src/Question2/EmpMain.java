package Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmpMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employe> emp = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter employee ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.println("Enter employee name:");
            String name = scanner.nextLine();
            emp.add(new Employe(id, name));
        }

        List<Employe> filteredEmployees = emp.stream()
                .filter(employee -> employee.getName().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Employees whose names start with 'A':");
        filteredEmployees.forEach(System.out::println);

    }
}
