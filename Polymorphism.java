package abc;

class Animal888 {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}
class Pig extends Animal888 {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}
class Dog888 extends Animal888 {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		Animal888 myAnimal = new Animal888();
		Animal888 myPig = new Pig();
		Animal888 myDog = new Dog888();
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}
