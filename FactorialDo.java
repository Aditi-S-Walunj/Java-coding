package abc;
import java.util.Scanner;

public class FactorialDo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	int fact=1;
	int i=1;
	do {
		fact=fact*i;
		System.out.println(fact);
		++i;
	}
	while(i<=n);
		System.out.println("Factorial of"+" "+n+" is:"+fact);
	sc.close();
}
}