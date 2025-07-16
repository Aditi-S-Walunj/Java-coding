package Info.abc;
import java.util.Scanner;

public class StudentInfo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Name:-");
	String name=sc.next();
	System.out.println("Enter Your Roll No:-");
	int Roll=sc.nextInt();
	System.out.println("Enter Your College Name:-");
	String clgname=sc.next();
	System.out.println("Enter Your Marks:-");
	float marks=sc.nextFloat();
	System.out.println("Your Name is:-"+name);
	System.out.println("Your Roll No is:-"+Roll);
	System.out.println("Your College Name is:-"+clgname);
	System.out.println("Your Marks :-"+marks);
   sc.close();
}
}
