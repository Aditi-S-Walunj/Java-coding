package abc;
import java.util.Scanner;

public class Student {
	int rollNo;
	String name;
	double percentage;
    Student(int rollNo, String name, double percentage) {
    	this.rollNo = rollNo;
	    this.name = name;
	    this.percentage = percentage;
	    }
    void display() {
    	System.out.println(rollNo + "\t" + name + "\t" + percentage);
    	}
    static void sortStudents(Student[] students) {
    	for (int i = 0; i < students.length - 1; i++) {
    		for (int j = i + 1; j < students.length; j++) {
    			if (students[i].percentage > students[j].percentage) {
    				Student temp = students[i];
	                students[i] = students[j];
	                students[j] = temp;
	         }
	     }
    }
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of students: ");
	int n = sc.nextInt();
	sc.nextLine(); 
	Student[] students = new Student[n];
	for (int i = 0; i < n; i++) {
		System.out.println("Enter details for student " + (i + 1));
        System.out.print("Roll No: ");
	    int roll = sc.nextInt();
	    sc.nextLine();
	    System.out.print("Name: ");
	    String name = sc.nextLine();
	    System.out.print("Percentage: ");
	    double per = sc.nextDouble();
	    students[i] = new Student(roll, name, per);
	        }
	System.out.println("\nOriginal Student List:");
	System.out.println("Roll\tName\tPercentage");
	for (Student s : students) {
		s.display();
		}
	sortStudents(students);
	System.out.println("\nSorted Student List (by Percentage):");
    System.out.println("Roll\tName\tPercentage");
    for (Student s : students) {
	     s.display();
	     }
    sc.close();
 }
}
