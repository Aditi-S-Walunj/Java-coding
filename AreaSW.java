//Find the Area of Different Shapes Choose from circle, rectangle, triangle, and find the area.
package abc;
import java.util.Scanner;

public class AreaSW {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final double pi=3.142;
		System.out.println("Enter shape to find area(Cirlce,Triangle,Rectangle):");
		String area=sc.next();
		switch(area){
		case "Circle":
			System.out.println("Enter radius:");
		    int r=sc.nextInt();
			System.out.println("Area of Circle is:"+(pi*r*r));
		break;
		case "Triangle":
			System.out.println("Enter base:");
			int B=sc.nextInt();
			System.out.println("Enter height:");
			int H=sc.nextInt();
			System.out.println("Area of Triangle is:"+(0.5*B*H));
		break;
		case "Rectangle":
			System.out.println("Enter length:");
			int l=sc.nextInt();
			System.out.println("Enter breadth:");
			int b=sc.nextInt();
			System.out.println("Area of Rectangle is:"+(l*b));
		break;
		default:System.out.println("not found");
}
		sc.close();
}
}