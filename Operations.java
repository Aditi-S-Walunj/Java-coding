package ac.com;
import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:-");
		int no1=sc.nextInt();
		System.out.println("Enter second number:-");
		int no2=sc.nextInt();
		System.out.println("First number is:"+no1);
		System.out.println("Second number is:"+no2);
		System.out.println("Addition is:"+(no1+no2));
		System.out.println("Subtraction is:"+(no1-no2));
		System.out.println("Multiplication is:"+(no1*no2));
		System.out.println("Division is:"+(no1/no2));
		float div=sc.nextFloat();
		System.out.println("Division is:"+div);
		System.out.println("Remainder is:"+(no1%no2));
		if(no1>no2 && no1!=no2)
		{
			System.out.println("First number is greater and both numbers are different");	
		}
		else if(no1<no2 && no1!=no2)
		{
			System.out.println("Second number is greater and both numbers are different");
		}
		else if(no1==no2)
		{
			System.out.println("Both numbers are equal");
		}
		sc.close();
}
}
