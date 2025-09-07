package abc;
import java.util.Scanner;

public class QuadrilateralSwitch {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Choose the type of Quadrilateral:");
	        System.out.println("1. Square");
	        System.out.println("2. Rectangle");
	        System.out.println("3. Parallelogram");
	        System.out.print("Enter your choice (1-3): ");
	        int choice = sc.nextInt();
	        switch (choice) {
	            case 1:
	                System.out.println("This is a Square.");
	                System.out.println("All sides equal and all angles are 90°.");
	                break;
	            case 2:
	                System.out.println("This is a Rectangle.");
	                System.out.println("Opposite sides equal and all angles are 90°.");
	                break;
	            case 3:
	                System.out.println("This is a Parallelogram.");
	                System.out.println("Opposite sides equal and opposite angles are equal.");
	                break;
	            default:
	                System.out.println("Invalid choice! Please select between 1 and 3.");
	        }
	    }
}
