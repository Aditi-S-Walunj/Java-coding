package abc;
import java.util.Scanner;

public class StudentReport {
	    int age;
	    double percentage;
	    char grade;
	    boolean isPassed;
	    float height;
	    byte section;
	    short rollNo;
	    long phoneNumber;
	    void printReport() {
	        System.out.println("----- Student Report -----");
	        System.out.println("Age: " + age);
	        System.out.println("Percentage: " + percentage);
	        System.out.println("Grade: " + grade);
	        System.out.println("Passed: " + isPassed);
	        System.out.println("Height: " + height);
	        System.out.println("Section: " + section);
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Phone Number: " + phoneNumber);
	    }
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        StudentReport s1 = new StudentReport();
	        System.out.print("Enter Age (int): ");
	        s1.age = sc.nextInt();
	        System.out.print("Enter Percentage (double): ");
	         s1.percentage = sc.nextDouble();
	        System.out.print("Enter Grade (char): ");
	        s1.grade = sc.next().charAt(0);
	        System.out.print("Is Passed? (true/false): ");
	        s1.isPassed = sc.nextBoolean();
	        System.out.print("Enter Height (float): ");
	        s1.height = sc.nextFloat();
	        System.out.print("Enter Section (byte): ");
	        s1.section = sc.nextByte();
	        System.out.print("Enter Roll No (short): ");
	        s1.rollNo = sc.nextShort();
	        System.out.print("Enter Phone Number (long): ");
	        s1.phoneNumber = sc.nextLong();
	        s1.printReport();
	        sc.close();
	    }
	}