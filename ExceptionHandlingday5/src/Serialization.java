import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int id;
    String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}

public class Serialization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter employee department: ");
        scanner.nextLine(); // consume newline left-over
        String department = scanner.nextLine();

        Employee emp = new Employee(name, id, department);

        try (FileOutputStream fileOut = new FileOutputStream("employee.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(emp);
            System.out.println("Employee object has been serialized to employee.ser");

        } catch (IOException i) {
            i.printStackTrace();
        }

        Employee deserializedEmp = null;
        try (FileInputStream fileIn = new FileInputStream("employee.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            deserializedEmp = (Employee) in.readObject();  // Reading object from file
            System.out.println("Employee object has been deserialized");

        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }

        if (deserializedEmp != null) {
            deserializedEmp.display();
        }

        scanner.close();
    }
}
