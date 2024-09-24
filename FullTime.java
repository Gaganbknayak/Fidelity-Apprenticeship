public class FullTime extends Employee{
  private double salary;
  private int year;

    public FullTime(int id ,String name,double salary,int year){
        super(id,name);
        this.salary = salary;
        this.year = year;
    }
    @Override
    public String getName(){
        return "Fulltime: "+  super.getName() + "\n Salary: "+  salary + "\nYear: " + year;
    }

}
