import java.util.Scanner;

class CustomerException extends Exception{
    public CustomerException(String message){
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter numerator");
            int num = sc.nextInt();
            System.out.println("Enter denominator");
            int den = sc.nextInt();
            int res = divide(num,den);
            System.out.println("Division result: "+res);

            System.out.println("Enter  file name: ");
            sc.nextLine();
            String fileName = sc.nextLine();
            readFille(fileName);
        }
        catch(ArithmeticException e){
            System.out.println("caught an ArithmeticException: Division by zero not allowed");
        }
        catch (CustomerException e){
            System.out.println("Caught a CustomerException: "+e.getMessage());
        }
        finally {
            System.out.println("Closing resources and finally executed");
        }
    }
    public static int divide(int num, int den){
        return num/den;
    }
    public static void readFille(String fileName) throws CustomerException{
        if (fileName.isEmpty()){
            throw new CustomerException("File name cannot be empty");
        }
        System.out.println("Reading file: "+fileName);
    }
}