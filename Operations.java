//Menu-Based Program for Arithmetic Operations Choose an operation (+, -, *, /) and perform it.
package abc;
import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a=sc.nextInt();
		System.out.println("Enter number 2:");
		int b=sc.nextInt();
		System.out.println("Enter the opration (+,-,*,/):");
		String operation=sc.next();
		switch(operation){
		case "+":System.out.println("Addition is:"+(a+b));
		break;
		case "-":System.out.println("Subtraction is:"+(a-b));
		break;
		case "*":System.out.println("Multiplication is:"+(a*b));
		break;
		case "/":System.out.println("Divion is:"+(a/b));
		break;
		default:System.out.println("Operation not found");
}
		sc.close();
}
}