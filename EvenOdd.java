package abc;
import java.util.Scanner;

public class EvenOdd {
 public static void main(String[] args) { 
	 int sum=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a Number:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.print(i+"=");
		if(i%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		sum+=i;
	}
	}
	System.out.println("Sum of Odd Numbers :"+sum);
	sc.close();
}
}