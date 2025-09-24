package abc;

public class CarSpeed {
	final int MAX_SPEED = 200;
    String model;
    int speed;
CarSpeed(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }
public void checkSpeed() {
        System.out.println("Car Model: " +model);
        System.out.println("Current Speed: "+ speed);
        if (speed > MAX_SPEED) {
            System.out.println("The car is over-speeding!");
        } else {
            System.out.println("The car is within the speed limit.");
        }
    }
 public static void main(String[] args) {
        CarSpeed car1 = new CarSpeed("Tesla Model S", 180);
        car1.checkSpeed();
        System.out.println();
        CarSpeed car2 = new CarSpeed("BMW M5", 220);
        car2.checkSpeed();
    }
}