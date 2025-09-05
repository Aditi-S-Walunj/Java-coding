package abc;
import java.util.Scanner;

public class SumDigitsDo {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int sum = 0;
	        int temp = num;  
	        do {
	            int digit = temp % 10; 
	            sum += digit;         
	            temp /= 10;           
	        } 
	        while (temp > 0);
	        System.out.println("Sum of digits of " + num + " is: " + sum);
	    }
}
