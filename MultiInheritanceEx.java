package abc;
import java.util.Scanner;

class Continent {
    String place;
Continent(String place) {
        this.place = place;
    }
   void displayContinent() {
        System.out.println("Continent: " + place);
    }
}
class Country extends Continent {
    String country;
    Country(String place, String country) {
        super(place);
        this.country = country;
    }
   void displayCountry() {
        System.out.println("Country: " + country);
    }
}
class State extends Country {
    String state;
    State(String place, String country, String state) {
        super(place, country);
        this.state = state;
    }
   void displayState() {
        System.out.println("State: " + state);
    }
   void displayDetails() {
        displayContinent();
        displayCountry();
        displayState();
    }
}
public class MultiInheritanceEx {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Continent Name: ");
	        String c1 = sc.nextLine();
	        System.out.print("Enter Country Name: ");
	        String c2 = sc.nextLine();
	        System.out.print("Enter State Name: ");
	        String c3 = sc.nextLine();
	        State s = new State(c1, c2, c3);
	        s.displayDetails();
	        sc.close();
	    }
}
