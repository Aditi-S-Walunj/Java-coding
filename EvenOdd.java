//Check if a Given Number is Odd or Even Using Switch Use modulo operation inside switch-case.
package abc;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			int num=sc.nextInt();
			switch(num % 2) {
            case 0:
                System.out.println("Number is Even");
                break;
            case 1:
                System.out.println("Number is Odd");
                break;
            default:
                System.out.println("Invalid Input");
        }
			sc.close();
	}
}