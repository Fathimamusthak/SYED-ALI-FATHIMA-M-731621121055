import java.util.Scanner;
public class MyClass2{
public static void main (String args[]){
int employeeId;
String employeeName;
float employeeSalary;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Employee Id");
employeeId =sc.nextInt();
System.out.println("Enter Employee Name");
employeeName = sc.next();
System.out.println("Enter Employee Salary");
employeeSalary = sc.nextFloat();
System.out.println("Enter Employee Id"+ employeeId);
System.out.println("Enter Employee Name"+ employeeName);
System.out.println("Enter Employee Salary"+ employeeSalary);
}
}
