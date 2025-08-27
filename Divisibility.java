package abc;
import java.util.Scanner;

public class Divisibility {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=sc.nextInt();
	 if (n % 3 == 0 && n % 5 == 0) {
         System.out.println(n + " is divisible by both 3 and 5");
     } else if (n % 3 == 0) {
         System.out.println(n + " is divisible by 3 only");
     } else if (n % 5 == 0) {
         System.out.println(n + " is divisible by 5 only");
     } else {
         System.out.println(n + " is not divisible by 3 or 5");
     }
	 sc.close();
}
}
