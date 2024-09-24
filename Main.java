//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Gagan");
        FullTime ft = new FullTime(111,"Ajith",20000,2024);
        PartTime pt = new PartTime(200,"Sumanth",10);
        System.out.println(e1.getName());
        System.out.println(ft.getName());
        System.out.println(pt.getName());
        }
    }
