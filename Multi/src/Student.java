public class Student extends Person {
    private String id;

    public Student(String name,int age,String id) {
        super(name,age);
        this.id = id;
    }
    @Override
    public String display(){
        return "Student id: " + id + "\n" + super.display();
    }

}
