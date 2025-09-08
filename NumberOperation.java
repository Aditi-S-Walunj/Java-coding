package abc;
import java.util.Scanner;

public class NumberOperation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Find the smallest of three numbers");
        System.out.println("2. Check Armstrong number");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
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
            case 2:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                int originalNum = num;
                int result = 0;
                int n = String.valueOf(num).length();
                while (num > 0) {
                    int digit = num % 10;
                    result += Math.pow(digit, n);
                    num /= 10;
                }
                if (result == originalNum) {
                    System.out.println(originalNum + " is an Armstrong number.");
                } else {
                    System.out.println(originalNum + " is NOT an Armstrong number.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please choose 1 or 2.");
        }
    }
}
