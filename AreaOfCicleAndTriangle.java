package area.abc;
import java.util.Scanner;

public class AreaOfCicleAndTriangle {
	public static void main(String[] args) {
		final float Pi=3.14f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		int radius=sc.nextInt();
		float area=Pi*radius*radius;
		System.out.println("Area of Circle:"+area);
		System.out.println("Enter the value of base:");
		int base=sc.nextInt();
		System.out.println("Enter the value of height:");
	    int height=sc.nextInt();
		float Area=0.5f*base*height;
		System.out.println("Area of Triangle:"+Area);
		sc.close();
}
}