package main; //# بنلاحظ انو هون لما ضفت  class Main بال package main ضفلي هاي
//# الجزئية عشان يعرف البرنامج انو class main  جوا package اسمه main
//& نفس الاشي بالنسبة للكاس person جوا package models
//% يفضل دائما يكون اسم ال package ببدأ بحرف صغير

import models.Person;//? بما اني انا بدي استخدم class person الموجود جوا package models لازم اعمله import من جوا ال package

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");//? for print anything in console /=> you can write it faster by
        //* write sout
        //# ========================type of variable ====================
        byte b = 123; //? allows you to create variable with real number and don't allow fraction number
        //! is allow numbers from -128 to 127
        short s = 12345; //? same byte but this allows number from -32768 to 32767
        int i = 12094; //? is the common type between most programing language and have a big range
        long l = 239029302; //? this type is bigger size than all previous type
        //% ليش عنا اربع انواع لتخزين الاعداد الصحيحة ؟ عشان استخدم النوع
        // %الي بناسب حاجتي وما اهلك الميموري بحجز مساحات ما رح استخدم منها الا جزء بسيط
        float f = 23.3F; //? this type is used to create variable with fraction number, and you should write F after
        //? last number to explain to compiler this is float number
        double d = 323232.343232; //? same float but this is reserve large number
        boolean bo = true; //? accept only ture or false value
        String st = "marsel hanani"; //? this type accept strings
        char ch = 'c'; //? this type accept only one character
        //==================constant===========================
        final int MAX = 10 ; // to mak constant variable just add final keyword
        //MAX = 20 ; //! i can't chang value because MAX is a constant
        //% ----------------------------------------------------------------
        //# you can declare more than one variable in one line
        int a, array[], matrix[][];
        //! ==========================================
        //! declaration => mean create variable without initial value
        //! initialization => mean create variable with initial value
        //! assignment => mean assign value to variable was declared
        System.out.println("my name is " + st); //? the + here called concatenation
        //# ======================read data from user=====================
        Scanner reader = new Scanner(System.in); //? create object from Scanner class
        System.out.println("Enter your name"); //* print to user to enter his name
        String name = reader.nextLine(); //* create string variable then read data from user by function nextLine
        System.out.println("Hello " + name); //* print Hello and name that user entered it
        //! you should use correct method to read data for example when you want to enter byte data you should use
        //! nextByte
        byte age = reader.nextByte(); //& because we want read byte
        System.out.println(age);
        //=====================conditions=======================
        if (b < i) {
            System.out.println("b is smaller");
        } else {
            System.out.println("b is larger");
        }
        //*=========== logic conditions ==============
        if (age > 10 && age < 18) { //% must all conditions be true
            System.out.println("you are a younger");
        }
        if (age < 10 || age > 18) { //% must one condition be true
            System.out.println("you are an elder");
        }
        if (!(age > 10 && age < 18)) { //% not all conditions be true
            System.out.println("you are not young");
        }
        //=======================Loops==============================
        for (int j = 0; j < 10; j++) { //? for loop
            System.out.println(j);
        }
        while (b > 0) {//? while loop
            System.out.println(b);
            b--;
        }
        do {//? do while loop
            System.out.println(b);
            b--;
        } while (b > 0);
        //=====================Arrays==========================
        int[] arr = new int[3]; //? create array of size 3
        arr[0] = 1; //? assign value to index 0
        arr[1] = 2; //? assign value to index 1
        arr[2] = 3; //? assign value to index 2
        //# or you can write it in this way
        int myArray[];
        myArray = new int[3];
        //% or you can give initial value to array
        int Array[] = {1, 2, 3};
        //* you can read data from user by use loop
        for (int j = 0; j < arr.length; j++) {
            arr[j] = reader.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {//? for loop to print all values in array
            System.out.println(arr[j]);
        }
        // we have a lot of methods in array
        Arrays.sort(arr); //? Arrays is resaved word that has all method so when i want to use methods
        //? i should write Arrays then dot then name of method
        int[][] arr2 = new int[3][3]; //& create 2D array (matrix)
        for (int j = 0; j < arr2.length; j++) {
            for (int k = 0; k < arr2.length; k++) {
                arr2[j][k] = reader.nextInt();
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            for (int k = 0; k < arr2.length; k++) {
                System.out.print(arr2[j][k]); //! to print element in the same line
            }
        }
        //------------------------------String----------------------------------
        String str = "hello world";
        System.out.println(str.length());//? to know number of characters in string
        System.out.println(str.charAt(3));//? to know character at index
        System.out.println(str.indexOf("l"));//? return index of the first char that found in string
        //& here we have to (L) but the indexOf method will return 3 because the first l is at index 3
        System.out.println(str.indexOf("l", 6));//? to know index of char after index 6
        //% if char was not found it will return -1
        System.out.println(str.lastIndexOf("o"));//# it same indexOf but it starts from last index
        System.out.println(str.substring(2, 5));//? to get substring from index 2 to index 5
        System.out.println(str.substring(2));//? to get substring from index 2 to end
        System.out.println(str.replace("l", "L"));//? to replace char
        System.out.println(str.replaceFirst("l", "all"));//? to replace first char that found
        System.out.println(str.toUpperCase());//? to change string to upper case
        System.out.println(str.toLowerCase());//? to change string to lower case
        System.out.println(str.trim());//? to remove spaces
        System.out.println(str.isEmpty());//? to check if string is empty
        System.out.println(str.isBlank());//? to check if string is blank
        System.out.println(str.split(" "));//? to split string by space
        System.out.println(str.split("l"));//? to split string by char
        System.out.println(str.startsWith("h"));//? to check if string start with h
        System.out.println(str.endsWith("d"));//? to check if string end with d
        System.out.println(str.contains("o"));//? to check if string contain o
        System.out.println(str.equals("hello world"));//? to check if string equal to hello world
        System.out.println(str.trim());//? to remove spaces from start and end


        //! important thing about child practice if you declare a variable inside main practice you can use in anywhere
        //! if you declare variable inside child practice you can only use in child
        int ff = 3;
        if(ff == 3) {
            System.out.println(f);
            int ll = 4;
        }
        System.out.println(l);//# l is not defined
        Person person = new Person();//# you must use new keyword to reserve memory for object
        person.setName("Marcel");//% saved name of person
        person.setAge((byte) 21);//% to saved age of person you should make casting to byte
        //? i want read number of list in family from user then i want sa ed it to array
        Scanner readers = new Scanner(System.in);//& create object of scanner to read data from user
        System.out.println("Enter number of list in family");
        int n = reader.nextInt();// read number of list
        Person[] list = new Person[n];//? create array of list
        for (int ii = 0; ii < list.length; ii++) {
            Person Person = new Person();// to reservation of memory for each person then enter his name and his age
            System.out.println("Enter name of person " + (ii + 1));
            Person.setName(reader.next());//! read person's name, i use next because i read string in
            System.out.println("Enter age of person " + (ii + 1));
            Person.setAge(reader.nextByte());//! read person's age
            list[ii] = Person;
        }
        //# to print all list in array
        for (int r = 0; r < list.length; r++) {

            System.out.println(list[i].getName() + " " + list[r].getAge());
        }
        //& to print the person by function call
        Person person1 = new Person();//? empty constructor
        person1.setName("Marcel");
        person1.setAge((byte) 21);
        Person person2 = new Person("Marcel", (byte) 21);//? constructor with parameters

        Person aa = new Person();
        Person bb = new Person();
        aa.count=20;
        System.out.println(aa.count);
        System.out.println(bb.count);
        //? here i create to object from class but if you see after i change data of count and print result
        //? the count in object a and b is the same
        int c = Person.count; //& here i use static variable without create object from class
        System.out.println(c);//% will print 20
        Person.count = 30;
        System.out.println(Person.count);//# will print 30




    }
}
//================= Access modifiers =================
//# public =>> anyone can access it from anywhere in the project , i can use it with class and attributes
//% protected =>> anyone can access it from anywhere in the package and if class inherits from it , used with only attributes
//% can't use it with declaration of class
//& private =>> only the owner of the class can access it, used with only attributes can't use it with declaration of class
//* if don't use access modifiers , default is package private => can't access on it out of the package





























