public class Product {
    private int pid;
    private String pname;
    private String  pcat;
    static String Sname = "DSU";

    public void initialize(int pid, String pname, String pcat) {
        this.pid = pid;
        this.pname = pname;
        this.pcat = pcat;
    }
    public void display() {
        System.out.println("Product Id: " + pid+"\nProduct Name: " + pname+"\nProduct category: " + pcat);

    }
    public void show(){
        System.out.println("Product Store: " + Sname );
    }
}
