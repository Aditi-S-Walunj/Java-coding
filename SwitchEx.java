package abc;
import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number from 1-3:");
		int num=sc.nextInt();
		switch(num){
		case 1:System.out.println("One");
		break;
		case 2:System.out.println("Two");
		break;
		case 3:System.out.println("Three");
		break;
		default:System.out.println("Number not found");
		}
sc.close();
	}
}