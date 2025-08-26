package abc;

class Animal123 {
	 void eat() {
	     System.out.println("Animal is eating");
	 }
	}
class Dog extends Animal123 {
	 void bark() {
	     System.out.println("Dog is barking");
	 }
	}
class Labrador extends Dog {
	 void display() {
	     System.out.println("Labrador is a type of Dog");
	 }
	}
public class MultiLevel {
	 public static void main(String[] args) {
	     Labrador labrador = new Labrador();
	     labrador.eat();   
	     labrador.bark();  
	     labrador.display();
	 }
}
