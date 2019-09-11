package com.ilhamsurya;

//Import Statement come after the package statement
import java.time.LocalDate;
import java.util.Random;

//Initialization Block 4.6.7
public class Employee {
    private static int nextId;

    //setting all to default arguments
    private int id;
    private String name = "";
    private double salary;
    private LocalDate hireDay;

    //static initialization block
    static{
        //method overloading
        Random generator = new Random();
        //set nextId to a random number
        nextId = generator.nextInt(10000);
    }

    //object initialization block
    {
        id = nextId;
        nextId++;
    }

    //three overloaded constructor
    public Employee(String name, double salary, int year, int month, int day){
        //using 4.6.5 Parameter Names
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee(double s){
        //call the Employee (String, double) Constructor
        //4.6.6 Calling Another Constructor
        this("Employee" + nextId, s);
        nextId++;
    }

    //the default constructor
    //4.6.3 Constructor with no arguments
    //setting all to default
    public Employee(String s, double v){
        name = "";
        salary = 0;
        //name initialized to""
        //salary not explicitly set
        //od omotoalized to
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary+= raise;
    }
}
