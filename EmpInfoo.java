package emp;
import java.util.Scanner;

public class EmpInfoo 
{
	EmpInfoo(String Name,float Salary)
	{
		System.out.println("Your Name:"+Name);
		System.out.println("Your Salary:"+Salary);
	}
	void display()
	{
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String Name=sc.next();
		System.out.println("Enter Your Salary:");
		float Salary=sc.nextFloat();
		EmpInfoo e1=new EmpInfoo(Name,Salary);
		e1.display();
		sc.close();
	}
}