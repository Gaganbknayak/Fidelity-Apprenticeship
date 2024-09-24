import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        int grade = mark/10;
        switch (grade) {
            case 10:
            case 9:
                System.out.println("A1 grade");
                System.out.println("Exellent");
                break;
            case 8:
                System.out.println("A grade");
                System.out.println("Very Good");
                break;
            case 7:
                System.out.println("B");
                System.out.println("Good");
                break;
            default:
                if(mark>=0 && mark<=70){
                    System.out.println("C grade");
                    System.out.println("need to improve");

                }
                else{
                    System.out.println("invalid");
                    break;
                }
        }
    }
}