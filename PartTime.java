public class PartTime extends Employee{
    private double hours;
    public PartTime(int id, String name, double hours) {
        super(id, name);
        this.hours = hours;
    }
    @Override
    public String getName(){
        return "Part time: "+ super.getName() + "Hours: " + hours ;
    }

}
