package abc;
import java.util.Scanner;

public class Discount {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your purchase amount: ");
	        double amount = sc.nextDouble();
	        System.out.print("Enter your loyalty status (Gold/Silver/None): ");
	        String loyalty = sc.next();
	        double discount = 0;
	        if (amount >= 500) {
	            discount += 10;
	        }
	        switch (loyalty) {
	            case "Gold":
	                discount += 5;
	                break;
	            case "Silver":
	            case "None":
	                discount += 0;
	                break;
	            default:
	                System.out.println("Invalid loyalty status entered!");
	                return;
	        }
	        System.out.println("Your final discount is: " + discount + "%");
	    }
	}
