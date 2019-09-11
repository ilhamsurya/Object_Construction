package com.ilhamsurya;

public class Main {

    public static void main(String[] args) {
	// Starting with Employee Class
        //4.6 Object Construction
        /*Employee[] staff = new Employee[3];
        staff[0] = new Employee("Lolmastah", 10000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        //print out information about all Employee Object
        for(Employee e : staff)
            System.out.println("name-" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
        */

        //4.7 Packages
        Employee lolmastah = new Employee("Lolmastah", 50000, 2000,10,1);
        lolmastah.raiseSalary(5);
        System.out.println("name-" + lolmastah.getName() + " salary = " + lolmastah.getSalary());
    }
}
