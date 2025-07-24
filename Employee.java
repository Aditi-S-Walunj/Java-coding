package com.Final;

public class Employee {
	static String CompanyName;
	int Id;
	String Name;
	float salary;
	static {
		CompanyName="Future Developers";
	}
	Employee(int Id,String Name,float salary){
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
	Employee e1=new Employee(1,"Adit",60000f);
	e1.display();
}
}