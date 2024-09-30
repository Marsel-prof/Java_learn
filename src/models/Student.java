package models;

public class Student extends Person implements PrintDataObject{ //# to make inheritance from interface use implements keyword
    private byte Grade;

    public byte getGrade() {
        return Grade;
    }

    public void setGrade(byte grade) {
        Grade = grade;
    }

    public Student(String name, int age, byte grade) {
        super(name, age);
        Grade = grade;
    }

    public void printData(){
        System.out.println(this.name+" " + this.age + " " + this.Grade);//% Name is error i can't access
        //% on it because it's private
    }
    public String whoAmI(){//& i inherit this function
// & from parent class but here i change it to return i am student
        //% this is called overriding
        return "I am a student";
    }
    @Override
    public String PrintMessage() {
        return "Hi from interface";
    }


}
