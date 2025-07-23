package circle.abc;
import java.util.Scanner;

public class AreaOfCircle {
public static void main(String[] args) {
	final float Pi=3.14f;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius:");
	int radius=sc.nextInt();
	float area=Pi*radius*radius;
	System.out.println("Area of Circle:"+area);
	sc.close();
}
}