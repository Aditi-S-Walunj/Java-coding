package Area;

class Circle{
	static double Pi=3.14;
	void insert(int radius) {
		double area=Pi*radius*radius;
		System.out.println("Area of circle is:"+area);
	}
}
public class AreaOfCircle {
public static void main(String[] args) {
	Circle c1=new Circle();
	c1.insert(2);
}
}