package com.javaProject3;
class Employee {
    int salary;
  Employee(int salary) {
        this.salary = salary;
    }
    void work() {
        System.out.println("Working as an employee!");
    }
    int getSalary() {
      return salary;
    }
}
class HrManager extends Employee {
    HrManager(int salary) {
        super(salary);
    }
    @Override
    void work() {
        System.out.println("Managing employees!");
    }
    public void addEmployee() {
        System.out.println("Adding a new employee!");
    }
}
public class Employees {
	public static void main(String[] args) {
		Employee emp = new Employee(40000);
        HrManager hr = new HrManager(70000);
        
        emp.work();
        hr.work(); 
        
        System.out.println("Employee salary: " + emp.getSalary());
        System.out.println("Manager salary: " + hr.getSalary()); 
        hr.addEmployee(); 
	}
}


