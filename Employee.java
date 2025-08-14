package abc;
import java.util.Scanner;

public class Employee {
	int id;
	String name;
	String deptname;
	double salary;
	static int cnt = 0;
	Employee(int id, String name, String deptname, double salary) {
		this.id = id;
		this.name = name;
		this.deptname = deptname;
		this.salary = salary;
		cnt++;
		System.out.println("Count of object : " + cnt);
	    }
	void display() {
		System.out.println(this.id + "\t\t" + this.name + "\t\t" + this.deptname + "\t\t" + this.salary);
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees:");
		int n = sc.nextInt();
        Employee[] e = new Employee[n];
        for (int i = 0; i < n; i++) {
	    System.out.println("Enter " + (i + 1) + " employee data");
	    System.out.print("Enter ID: ");
	    int id = sc.nextInt();
	    sc.nextLine();
	    System.out.print("Enter Employee Name: ");
	    String en = sc.nextLine();
	    System.out.print("Enter Department Name: ");
	    String dn = sc.nextLine();
	    System.out.print("Enter Salary: ");
	    double salary = sc.nextDouble();
	    e[i] = new Employee(id, en, dn, salary);
	    }
        System.out.println("\nEmployee Records:");
        System.out.println("ID\tEmployee Name\t\tDepartment\tSalary");
        for (int i = 0; i < n; i++) {
        	e[i].display();
        	}
	    sc.close();
	 }
}
