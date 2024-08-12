package org.google.dev;
//class & object
class Employee {
	//variables
	int employeeId;
	String employeeName;
	float employeeSalary;
	//constructor
	Employee(int employeeId,String employeeName,float employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	//method
	void display() {
		System.out.println("Employee Id :"+ employeeId);
		System.out.println("Employee Name :"+ employeeName);
		System.out.println("Employee Salary :"+ employeeSalary);
	}

public static void main(String args[]) {
	Employee emp1 = new Employee(101,"Fathima",5000.0f);
	emp1.display();
	Employee emp2 = new Employee(102," Syed Ali Fathima",50000.0f);
	emp2.display();
}
}
