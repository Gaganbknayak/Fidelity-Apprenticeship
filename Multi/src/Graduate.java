public class Graduate extends Student{
    String degree;
    public Graduate(String name, int age, String id, String degree) {
        super(name, age, id);
        this.degree = degree;

    }
    @Override
    public String display() {
        return "Degree: " + degree + "\n" + super.display();
    }
}
