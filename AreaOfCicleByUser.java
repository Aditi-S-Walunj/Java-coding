package area.abc;
import java.util.Scanner;

public class AreaOfCicleByUser {
public static void main(String[] args) {
	double Pi=3.14;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Value of Radius:");
	int radius=sc.nextInt();
	System.out.println("Area of Circle is:"+(Pi*radius*radius));
	sc.close();
}
}
