package vehicle;

class car {
    short CarNo=1234;
	String CarName="Thar"; 
	String CarBrand="Mahindra";
    float CarPrice=1700000.00f;
    String CarColour="Black";
}
class Bike{
	 short BikeNo=4050;
		String BikeName="passion"; 
		String BikeBrand="hero";
	    float BikePrice=100000.00f;
	    String BikeColour="Black";
}
class Bicycle{
	 short BicycleNo=4050;
		String BicycleName="herculas"; 
		String BicycleBrand="hero";
	    float BicyclePrice=80000.00f;
	    String BicycleColour="Black";
}
public class Vehicle {
	public static void main(String[] args)
	{
		car c1=new car();
		Bike b1=new Bike();
		Bicycle b2=new Bicycle();
		System.out.println("Car Number is:"+c1.CarNo);
		System.out.println("Car name is:" +c1.CarName);
		System.out.println("Car Brand is:"+c1.CarBrand);
		System.out.println("Car price is:"+c1.CarPrice);
		System.out.println("Bike Number is:"+b1.BikeNo);
		System.out.println("Bike name is:" +b1.BikeName);
		System.out.println("Bike Brand is:"+b1.BikeBrand);
		System.out.println("Bike price is:"+b1.BikePrice);
		System.out.println("Bicycle Number is:"+b2.BicycleNo);
		System.out.println("Bicycle name is:"+b2.BicycleName);
		System.out.println("Bicycle Brand is:"+b2.BicycleBrand);
		System.out.println("Bicycle price is:"+b2.BicyclePrice);
	}
}
