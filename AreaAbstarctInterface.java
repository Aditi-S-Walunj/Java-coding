package abc;

abstract class Shape{
	abstract void CalculateArea();
	void DisplayShapeName(String name) {
		System.out.println("-----------------");
		System.out.println("The name of shape:"+name);
	}
}
interface Resize{
	void resize(double factor);
}
class Rectangle extends Shape implements Resize{
	double length,breadth;
    Rectangle(double length, double breadth) {
	        this.length = length;
	        this.breadth = breadth;
}
    @Override
    void CalculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    @Override
    public void resize(double factor) {
        length *= factor;
        breadth *= factor;
        System.out.println("Rectangle resized by factor " + factor);
    }
}
class Circle extends Shape implements Resize{
	int radius;
	final double pi=3.142;
	Circle(int radius){
		this.radius=radius;
	}
	 @Override
	    void CalculateArea() {
	        double area = pi*radius*radius;
	        System.out.println("Area of Circle: " + area);
	    }
	    @Override
	    public void resize(double factor) {
	        radius *= factor;
	        System.out.println("Circle resized by factor " + factor);
	    }
}
public class AreaAbstarctInterface {
public static void main(String[] args) {
	 Shape s1= new Rectangle(3, 3);
     s1.DisplayShapeName("rectangle");
     s1.CalculateArea();
     ((Resize)s1).resize(2);
     s1.CalculateArea();
     Circle c1=new Circle(1);
     c1.DisplayShapeName("circle");
     c1.CalculateArea();
     c1.resize(2);
     c1.CalculateArea();
}
}