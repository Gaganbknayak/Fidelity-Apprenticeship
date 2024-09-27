package Question9;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAdult() {
        return getAge(dob) >= 18 ? "Adult" : "Child"; //ternary operator
    }

    public int getAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - dob.getYear() - (currentDate.getDayOfYear() < dob.getDayOfYear() ? 1 : 0);
    }

    public void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + getAge(dob));
        System.out.println(getAdult());
    }
}

