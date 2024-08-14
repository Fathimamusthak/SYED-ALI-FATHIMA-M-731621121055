package com.javaProject3;
class Person {
    String firstName;
    String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    String getFirstName() {
        return firstName;
    }
    String getLastName() {
        return lastName;
    }
}
class Emp extends Person {
    int employeeId;
    String jobTitle;
    public Emp(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
    public int getEmployeeId() {
        return employeeId;
    }
   @Override
String getLastName() {
	return super.getLastName();
}
}
public class Persons {
	public static void main(String args[]) {
    Emp e1 = new Emp("Fathima", "Musthak", 55, "Software Engineer");
        System.out.println("First Name: " + e1.getFirstName());
    System.out.println("Last Name: " + e1.getLastName());
    System.out.println("Employee ID: " + e1.getEmployeeId());
    System.out.println("Employee Job Title: " + e1.jobTitle);
	}
}