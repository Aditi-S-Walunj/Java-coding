package abc;
import java.util.Scanner;

public class FactorialWhile {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	int fact=1;
	int i=1;
	while(i<=n) {
		fact=fact*i;
		System.out.println(fact);
		++i;
	}
	System.out.println("Factorial of"+" "+n+" is:"+fact);
		sc.close();
	}
}