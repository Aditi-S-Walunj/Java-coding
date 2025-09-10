package abc;
import java.util.Scanner;

public class SumofDigitsSwitch {
public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Choose an operation:");
	        System.out.println("1. Check Armstrong Number (sum of cubes of digits)");
	        System.out.println("2. Find Sum of Digits");
	        System.out.print("Enter your choice: ");
	        int choice = sc.nextInt();
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        switch (choice) {
	            case 1:
	                int temp1 = num, sum1 = 0;
	                while (temp1 > 0) {
	                    int digit = temp1 % 10;
	                    sum1 += digit * digit * digit; 
	                    temp1 /= 10;
	                }
	                if (sum1 == num) {
	                    System.out.println(num + " is an Armstrong number.");
	                } else {
	                    System.out.println(num + " is NOT an Armstrong number.");
	                }
	                break;
	            case 2:
	                int temp2 = num, sum2 = 0;
	                while (temp2 > 0) {
	                    int digit = temp2 % 10;
	                    sum2 += digit; 
	                    temp2 /= 10;
	                }
	                System.out.println("The sum of digits of " + num + " is: " + sum2);
	                break;
	                default:
	                       System.out.println("Invalid choice!");
	        }
	        sc.close();
	    }
	}