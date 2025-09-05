package abc;

class Shape{
	double area;
}
class Circle extends Shape{
final double PI=3.14;
	void calculateArea(int r) {
		area=PI*r*r;
	}
	void display() {
		System.out.println("Area of Circle is:"+area);
	}
}
class Square extends Shape{
	void calculateArea(int l,int b) {
		 area=l*b;
	}
	void display() {
		System.out.println("Area of Square is:"+area);
	}
}
class Triangle extends Shape{
	void calculateArea(int b,int h) {
		 area=0.5*b*h;
	}
void display() {
	System.out.println("Area of Triangle is:"+area);
}
}
public class ShapesInheritance {
	public static void main(String[] args) {
 Circle c1=new Circle();
 c1.calculateArea(22);
 c1.display();
 Square s1=new Square();
 s1.calculateArea(2,2);
 s1.display();
 Triangle t1=new Triangle();
 t1.calculateArea(2,2);
 t1.display();
}
}
