package org.java.dev;

public class Employee {
	String name;
    String jobTitle;
    int salary;


	public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
	}
	void setName(String name) {
	    this.name = name;
	}

void setJobTitle(String jobTitle) {
    this. jobTitle =  jobTitle;
}

	void setSalary(int salary) {
	    this.salary = salary;
	}
	String getName() {
	    return this.name;
	}
	String getjobTitle() {
	    return this.jobTitle;
	}
	int getSalary() {
		return this.salary;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Fathima","Software Engineer",60000);
		Employee e2 = new Employee("syed","Software Engineer",6000);
		System.out.println("Employee Details");
		 System.out.println("Employee1 Name " + e1.getName() + "Job of  Employee1: " +e1.getjobTitle()+",Salary of Employee1:"+ e1.getSalary());
		 System.out.println("Employee2 Name:"+ e2.getName() + ",Job of Employee2: " + e2.getjobTitle()+",Salary of Employee2:"+e2.getSalary());

		    e1.setName("Abi");
		    e2.setName("Fathi");
		    e1.setJobTitle("Doctor ");
		    e2.setJobTitle("Engineer");
		    e1.setSalary(678778);
		    e1.setSalary(60078);

		    System.out.println("Updated Details of an Employee");
		    System.out.println("Updated name of Employee1" + e1.getName() + ",Updated Job of Employee1: " +e1.getjobTitle()+",Updated Salary of Employee1:"+ e1.getSalary());
			System.out.println("Updated name of Employee2:"+ e2.getName() + ",Updated Job of Employee2: " + e2.getjobTitle()+",Updated Salary of Employee2:"+e2.getSalary());
		}		
	}





