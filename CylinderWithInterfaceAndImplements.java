package abc;
import java.util.Scanner;

interface Operation {
    double PI = 3.142;
    void area();
    void volume();
}
class Cylinder implements Operation {
    int radius;
    int height;
    Cylinder(int r, int h) {
        radius = r;
        height = h;
    }
    public void area() {
        double area = 2 * PI * radius * height + 2 * PI * radius * radius;
        System.out.println("Surface Area = " + area + " sq. units");
    }
    public void volume() {
        double volume = PI * radius * radius * height;
        System.out.println("Volume = " + volume + " cubic units");
    }
}
public class CylinderWithInterfaceAndImplements {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter radius: ");
	        int r = sc.nextInt();
	        System.out.print("Enter height: ");
	        int h = sc.nextInt();
	        Cylinder c = new Cylinder(r, h);
	        c.area();
	        c.volume();
	        sc.close();
	    }
}
