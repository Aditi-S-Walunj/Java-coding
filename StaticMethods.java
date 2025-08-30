package abc;
import java.util.Scanner;

public class StaticMethods {
	static int addition(int x, int y) {
		return x+y;
	}
	static int difference(int x, int y) {
		return x-y;
	}
public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a and b:");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Addition of "+a+" and "+b+" = "+addition(a,b));
	System.out.println("Subtraction of "+a+" and "+b+" = "+difference(a,b));
	sc.close();
}
}
