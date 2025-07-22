package rectangle;
import java.util.Scanner;

public class AreaAndPerimeter {
	public static void main(String[] args) {
	int l,b,area,perimeter;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Length of rectangle is:");
	l=sc.nextInt();
	System.out.println("Enter the Breadth of rectangle is:");
	b=sc.nextInt();
	area=l*b;
	System.out.println("Area of rectangle is:"+area);
	perimeter=2*(l+b);
	System.out.println("Perimeter of rectangle is:"+perimeter);
	sc.close();
}
}