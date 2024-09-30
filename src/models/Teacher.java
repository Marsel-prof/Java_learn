package models;

public class Teacher extends Person {
    private int salary ;

    public int getSalary() {
        return salary;
    }

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String whoAmI() {
        return "I am a Teacher";
    }
}
