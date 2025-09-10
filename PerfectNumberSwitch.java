package abc;
import java.util.Scanner;

public class PerfectNumberSwitch {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int sum = 0;
	        for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }
	        switch (sum == num && num != 0 ? 1 : 0) {
	            case 1:
	                System.out.println(num + " is a Perfect Number.");
	                break;
	            case 0:
	                System.out.println(num + " is NOT a Perfect Number.");
	                break;
	        }
	        sc.close();
	    }
	}
