public class TempEmp extends Employee {
    private int dailywages;
    private int noOfDays;

    public TempEmp(int id,String name,int dailywages,int noOfDays){
        super(id,name,0);
        this.dailywages=dailywages;
        this.noOfDays=noOfDays;
        calculateNetSalary();
        calculateBonus();
    }
    @Override
    public void calculateNetSalary() {
        netSalary = dailywages * noOfDays;
    }

    @Override
    public void calculateBonus() {
        if (dailywages < 1000) {
            bonus = 0.15f * netSalary;
        } else if (dailywages >=1000 && dailywages<1500) {
            bonus = 0.12f * netSalary;
        } else if (dailywages>=1500 && dailywages < 1750) {
            bonus = 0.11f * netSalary;
        } else {
            bonus = 0.08f * netSalary;
        }
    }
    @Override
    public void display(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Daily Wages: "+dailywages);
        System.out.println("Employee No.of Days: "+noOfDays);
        System.out.println("Employee Bonus: "+bonus);
        System.out.println("Employee Net Salary: "+netSalary);

    }

}
