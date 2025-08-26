package abc;
import java.util.Scanner;

public class PrimeNo {
public static void main(String[] args) {
	int i;
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=Sc.nextInt();
	for(i=2;i<n;i++) 
	if(n%i==0) 
		break;
		if(i==n) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		Sc.close();
}
}