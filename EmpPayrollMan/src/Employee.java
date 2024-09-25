public class Employee {
    protected int id;
   protected String name;
    protected float basicSalary;
    protected float bonus;
    protected float netSalary;

    public Employee(int id, String name, float basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = 0;
        this.netSalary = 0;
    }
    public void calculateBonus() {

    }
    public void calculateNetSalary() {

    }
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Basic Salary: " + basicSalary);
        System.out.println("Employee Bonus: " + bonus);
        System.out.println("Employee Net Salary: " + netSalary);
    }
}
