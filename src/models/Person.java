package models;
public abstract class Person { //# we add abstract keyword here because if we create object i can't access on
    //# abstract methods because it doesn't have body
    //% so after add abstract keyword i can't create object from Person class
    /*// the good practice is prevent access to the instance variable from outside the class
    //? so we will make them private and then make setter and getter methods
    private String Name ;
    private byte Age ;
    public static int count; //& to declare static variable(class variable)
    //* same things you can create static methods
    public static int factorial(int number){
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public Person(){
        System.out.println("i am in constructor"); //& the constructor is first thing run when you create an object
        //# so i use constructor to reserve memory for object and give initial value to variables
    }
    public Person(String name,byte age){//% i can create multiple constructors
        Name = name;
        Age = age < 0 ? 0 : age;
    }

    public byte getAge() {
        return Age;
    }

    public void setAge(byte age) {
        Age = age < 0 ? 0 : age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }*/
    protected String name ;//! because this attribute is private i can't access on it outside this class
    protected int age ;//? but because this attribute is protected i can access on it form inherit classes

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String whoAmI(); //? after add abstract i should implement this function in each subclass
}
