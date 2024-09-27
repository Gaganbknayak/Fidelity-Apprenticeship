package Question5;

public class Account {
    private int id;
    private String accType;
    private double balance;

    public Account() {
        this.id = 0;
        this.accType = "";
        this.balance = 0.0;
    }
    public Account(int id, String accType, double balance) {
        this.id = id;
        this.accType = accType;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public String getAccountType() {
        return accType;
    }
    public void setAccountType(String accType) {
        this.accType = accType;
    }

    public String getAccType() {
        return accType;
    }

    public double getBalance() {
        return balance;
    }
    public boolean withdraw(double amount) {
        if(amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
    public String getDetails() {
        return "Account ID: " + id + "\nAccount Type: " + accType + "\nBalance: " + balance;
    }
}
