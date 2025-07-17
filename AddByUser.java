package add.abc;
import java.util.Scanner;

public class AddByUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:-");
		int firstno=sc.nextInt();
		System.out.println("Enter second number:-");
		int secondno=sc.nextInt();
		System.out.println("Addition is:"+(firstno+secondno));
		sc.close();
	}
	}