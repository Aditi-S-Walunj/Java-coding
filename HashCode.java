package hashcode;
import java.util.Scanner;

public class HashCode {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Username:");
	String Uname=sc.next();
	System.out.println("Enter Password:");
	String Pass=sc.next();
	System.out.println(Uname.hashCode());
	System.out.println(Pass.hashCode());
	sc.close();
}
}
