package abc;
import java.util.Scanner;

public class ReverseSmallestSwitch {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Choose an option:");
	        System.out.println("1. Reverse a number and check if it is palindrome");
	        System.out.println("2. Find the smallest of three numbers");
	        int choice = sc.nextInt();
	        switch (choice) {
	            case 1:
	                System.out.print("Enter a number: ");
	                int num = sc.nextInt();
	                int originalNum = num;
	                int reversed = 0;
	                while (num > 0) {
	                    int digit = num % 10;
	                    reversed = reversed * 10 + digit;
	                    num /= 10;
	                }
	                System.out.println("Reversed Number: " + reversed);
	                if (originalNum == reversed) {
	                    System.out.println("The number is a Palindrome.");
	                } else {
	                    System.out.println("The number is NOT a Palindrome.");
	                }
	                break;
	            case 2:
	                System.out.print("Enter first number: ");
	                int a = sc.nextInt();
	                System.out.print("Enter second number: ");
	                int b = sc.nextInt();
	                System.out.print("Enter third number: ");
	                int c = sc.nextInt();
	                int smallest;
	                if (a <= b && a <= c) {
	                    smallest = a;
	                } else if (b <= a && b <= c) {
	                    smallest = b;
	                } else {
	                    smallest = c;
	                }
	                System.out.println("The smallest number is: " + smallest);
	                break;
	            default:
	                System.out.println("Invalid choice! Please choose 1 or 2.");
	        }
	    }
}
