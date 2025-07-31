//Convert a Grade into Remarks  A=Outstanding,B = Excellent, C = Good, D = Average, E = Poor, F = Fail.
package abc;
import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter grade from A to F:");
		String grade=sc.next();
		switch(grade) {
	case "A":System.out.println("Outstanding");
	break;
	case "B":System.out.println("Excellent");
	break;
	case "C":System.out.println("Good");
	break;
	case "D":System.out.println("Average");
	break;
	case "E":System.out.println("Poor");
	break;
	case "F":System.out.println("Fail");
	break;
	default:System.out.println("Grade not found");
}
		sc.close();
}
}