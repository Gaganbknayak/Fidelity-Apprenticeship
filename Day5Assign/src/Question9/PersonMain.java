package Question9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Enter first name: ");
        person.setFirstName(scanner.nextLine());

        System.out.print("Enter last name: ");
        person.setLastName(scanner.nextLine());

        LocalDate dob = null;
        boolean validDate = false;

        while (!validDate) {
            System.out.print("Enter date of birth in yyyy/MM/dd format: ");
            String dobInput = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

            try {
                dob = LocalDate.parse(dobInput, formatter);
                validDate = true;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use yyyy/MM/dd.");
            }
        }

        person.setDob(dob);

        person.displayDetails();

    }
}

