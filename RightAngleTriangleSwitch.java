package abc;
import java.util.Scanner;

public class RightAngleTriangleSwitch {
 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first side: ");
	        int a = sc.nextInt();
	        System.out.print("Enter second side: ");
	        int b = sc.nextInt();
	        System.out.print("Enter third side: ");
	        int c = sc.nextInt();
	        int max = Math.max(a, Math.max(b, c));
	        int side1, side2;
	        if (max == a) {
	            side1 = b; side2 = c;
	        } else if (max == b) {
	            side1 = a; side2 = c;
	        } else {
	            side1 = a; side2 = b;
	        }
	        if (max * max == side1 * side1 + side2 * side2) {
	            System.out.println("It is a Right-Angled Triangle.");
	        } else {
	            System.out.println("It is NOT a Right-Angled Triangle.");
	        }
	        sc.close();
	    }
}
