public class Main {
    public static void main(String[] args) {
        Person p = new Person("Gagan", 24);
        Student s = new Student("Ajith",24,"ENG19CS001");
        Graduate g = new Graduate("Sumanth",24,"ENG19CS0100","BTECH");
        System.out.println("________Person information_____ "+ "\n" +p.display());
        System.out.println("******Student*****: "+  "\n" + s.display());
        System.out.println("#####Graduate######: "+  "\n" +g.display());
        }
    }
