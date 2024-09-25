import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PermanentEmp pe = new PermanentEmp(101,"Esther",25000,1500);
        pe.calculateNetSalary();
        pe.calculateBonus();
        System.out.println("Permanent Employee Details; ");
        pe.display();
        System.out.println("--------------------------------------------------");

        TempEmp te = new TempEmp(102,"Ganesh",1500,20);
        System.out.println("Temporary Emp Details: ");
        te.display();
    }
}