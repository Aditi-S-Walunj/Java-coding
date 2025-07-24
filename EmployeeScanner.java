package com.Final;
import java.util.Scanner;

public class EmployeeScanner {
	static String CompanyName;
	int Id;
	String Name;
	float salary;
	static {
		CompanyName="Future Developers";
	}
	EmployeeScanner(int Id,String Name,float salary){
		this.Id=Id;
		this.Name=Name;
		this.salary=salary;
	}
	void display() {
		System.out.println("Employee Id:"+Id);
		System.out.println("Employee Name:"+Name);
		System.out.println("Employee Salary:"+salary);
		System.out.println("Company Name:"+CompanyName);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employee Id:");
	int Id=sc.nextInt();
	System.out.println("Enter Employee Name:");
	String Name=sc.next();
	System.out.println("Enter Employee salary:");
	float salary=sc.nextFloat();
	EmployeeScanner e1=new EmployeeScanner(Id,Name,salary);
	e1.display();
	sc.close();
}
}