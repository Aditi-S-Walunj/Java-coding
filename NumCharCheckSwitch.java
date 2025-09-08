package abc;
import java.util.Scanner;

public class NumCharCheckSwitch {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Extract digits and sum them up (if-else)");
        System.out.println("2. Check if a character is an alphabet (switch)");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                int sum = 0;
                if (num < 0) {
                    System.out.println("Please enter a positive number!");
                } else {
                    int temp = num;
                    while (temp > 0) {
                        int digit = temp % 10;
                        sum += digit;
                        temp /= 10;
                    }
                    System.out.println("Sum of digits of " + num + " is: " + sum);
                }
                break;
            case 2:
                System.out.print("Enter a character: ");
                char ch = sc.next().charAt(0);
                switch (Character.isLetter(ch) ? 1 : 0) {
                    case 1:
                        System.out.println(ch + " is an Alphabet.");
                        break;
                    case 0:
                        System.out.println(ch + " is NOT an Alphabet.");
                        break;
                }
                break;
            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
        }
    }
}
