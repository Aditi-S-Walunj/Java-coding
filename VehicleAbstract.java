package abc;

abstract class Vehicle{
	abstract void start();
	abstract void stop();
void fuelType() {
	System.out.println("Different vehicles use different fuels.");
	}
}
class Bike extends Vehicle{
	@Override
	void start() {
	     System.out.println("Car started with a key ignition.");
	   }
	 @Override
	 void stop() {
	      System.out.println("Car stopped by pressing brake.");
	   }
}
class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Bike started with self start button.");
		}
     @Override
	 void stop() {
	    System.out.println("Bike stopped using disc brakes.");
	    }
}
public class VehicleAbstract {
public static void main(String[] args) {
	 Vehicle v1 = new Car();
     v1.start();
     v1.fuelType();
     v1.stop();
     Vehicle v2 = new Bike();
     v2.start();
     v2.fuelType();
     v2.stop();
}
}
