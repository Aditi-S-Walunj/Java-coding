package abc;
import java.util.Scanner;

public class CountDigitsDo {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int count = 0;
	        int temp = num;
	        do {
	            temp = temp / 10; 
	            count++;
	        } while (temp > 0);
	        System.out.println("Number of digits in " + num + " is: " + count);
	        sc.close();
	    }
}
