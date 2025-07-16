package AreaPerimeter;

class AP{
	void insert(int length,int breadth)
	{
		float area=length*breadth;
		float perimeter=2*length+2*breadth;
		System.out.println("Area of rectangle is:"+area);
		System.out.println("Perimeter of rectangle is:"+perimeter);
	}
}
public class AreaPerimeterOfRectangle {
public static void main(String[] args) {
	AP a1=new AP();
	a1.insert(20,20);
}
}
