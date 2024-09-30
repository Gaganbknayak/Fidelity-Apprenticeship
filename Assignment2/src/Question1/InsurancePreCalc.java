package Question1;

import java.util.Scanner;

public class InsurancePreCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Insurance Number: ");
        String number = sc.next();
        System.out.println("Insurance Name: ");
        String name = sc.next();
        System.out.println("Amount Covered: ");
        double amountCov = sc.nextDouble();
        System.out.println("Select");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");
        int option = sc.nextInt();

        double calculatedPremium = 0;
        switch (option) {
            case 1:
                System.out.println("Policy Term: ");
                int policyterm = sc.nextInt();
                System.out.println("Benefit Percent: ");
                float benifitPercent = sc.nextFloat();

                LifeInsurance li = new LifeInsurance(number, name, amountCov, policyterm, benifitPercent);
                calculatedPremium = li.calculatePremium();
                break;
            case 2:
                System.out.println("Depreciation Percent: ");
                float depreciationPercent = sc.nextFloat();
                MotorInsurance mi = new MotorInsurance(number, name, amountCov, depreciationPercent);
                calculatedPremium = mi.calculatePremium();
                break;
                default:
                    System.out.println("Invalid Option");
                    break;
        }
        System.out.println("Calculated Premium: "+calculatedPremium);
    }
}
