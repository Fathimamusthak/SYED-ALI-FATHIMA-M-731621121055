package org.google.dev;
import java.util.Arrays;
import java.util.Scanner;
class student{
	int regNum;
	String stuName;
	int marks[] = new int[5];
	int sum;
	float avg;
	String grade;
	student(int regNum, String stuName) {
		this.regNum=regNum;
		this.stuName=stuName;
		}
	void getmarks() {
		Scanner sc = new Scanner(System.in);
		 for (int i = 0; i < marks.length; i++) {
System.out.println("Enter marks for subject " + (i + 1) + ":");
 marks[i] = sc.nextInt();	
			}
	}
	void calgrade() {
		for(int i=0;i<5;i++) {
			sum=sum+marks[i];
		}
		avg = sum/5;
		if(avg>=90) {
			System.out.println("O  grade");
		}
		else if(avg>=80) {
			System.out.println("A grade");
		}
		else if(avg>=70){
			System.out.println("B grade");
		}
		else {
			System.out.println("C grade");
		}
		
	}
	void display() {
		System.out.println ("name:"+stuName);
		System.out.println("regnumber:"+regNum);
		System.out.println("average:"+avg);
		System.out.println("sum:"+sum);

	}

}
public class StudentGrade {
	public static void main(String[] args) {
		 student  obj = new  student(55 ,"Syed");
		obj.getmarks();
		obj.calgrade();
		obj.display();
	}
}

