package abc;
import java.util.Scanner;

public class Login {
public static void main(String[] args) {
	String Name="admin";
	String Pass="password123";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter User Name:");
	String name=sc.next();
	System.out.println("Enter Password:");
	String pass=sc.next();
	if(name.equals(Name) && pass.equals(Pass))
	{
		System.out.println("Login Successful");
	}
	else if(name.equals(Name) && !pass.equals(Pass))
	{
		System.out.println("Incorrect Password");
	}
	else if(!name.equals(Name) && pass.equals(Pass))
	{
		System.out.println("Incorrect Username");
	}
	else {
		System.out.println("Incorrect Username and Password");
	}
	sc.close();
}
}
