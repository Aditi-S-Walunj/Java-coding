package tybsc;
import java.util.Scanner;

class FYBSC{
	String Name;
	float SGPA;
	void getdata(Scanner sc) {
		System.out.println("Enter Your Name:");
	    Name=sc.next();
	    System.out.println("Enter Your FY SGPA:");
	    SGPA=sc.nextFloat();
	}
	void display() {
		System.out.println("You have entered the Name:"+Name);
		System.out.println("You have entered your FY SGPA:"+SGPA);
	}
}
class SYBSC{
	String Name;
	float SGPA;
	void getdata(Scanner sc) {
		System.out.println("Enter Your Name:");
	    Name=sc.next();
	    System.out.println("Enter Your SY SGPA:");
	    SGPA=sc.nextFloat();
	    sc.close();
	}
	void display() {
		System.out.println("You have entered the Name:"+Name);
		System.out.println("You have entered your SY SGPA:"+SGPA);
	}
}
public class TYBSCsc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FYBSC f1=new FYBSC();
		f1.getdata(sc);
		f1.display();
		SYBSC s1=new SYBSC();
		s1.getdata(sc);
		s1.display();
	}
}
