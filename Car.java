// Create a class Car with non-static method start() and a static method showCompanyName(). Call both methods from main.
package abc;

public class Car {
	String carName="Thar";
	float CarPrice=1700000.00f;
	String CarColour="Black";
	static {
		System.out.println("Mahindra");
	}
	void start() {
		System.out.println("Car name is:" +carName);
		System.out.println("Car Brand is:"+CarColour);
		System.out.println("Car price is:"+CarPrice);
	}
public static void main(String[] args) {
	Car c1=new Car();
	c1.start();
}
}
