package abc;

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
public class MultiInheritance {
	 public static void main(String[] args) {
	        State state = new State("Asia", "India", "Maharashtra");
	        state.displayDetails();
	    }
}
