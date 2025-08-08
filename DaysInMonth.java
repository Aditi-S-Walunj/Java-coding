package abc;
import java.util.Scanner;
public class DaysInMonth {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a month:");
	String day=sc.next();
	switch(day) {
	case "jan":
		System.out.println("Days in January are 31");
		break;
	case "feb":
		System.out.println("Days in Febuary are 29");
		break;
	case "march":
		System.out.println("Days in March are 31");
		break;
	case "april":
		System.out.println("Days in April are 30");
		break;
	case "may":
		System.out.println("Days in May are 31");
		break;
	case "june":
		System.out.println("Days in June are 30");
		break;
	case "july":
		System.out.println("Days in July are 31");
		break;
	case "august":
		System.out.println("Days in August are 31");
		break;
	case "september":
		System.out.println("Days in September are 31");
		break;
	case "october":
		System.out.println("Days in October are 30");
		break;
	case "november":
		System.out.println("Days in November are 31");
		break;
	case "december":
		System.out.println("Days in December are 31");
		break;
	}
	sc.close();
}
}
