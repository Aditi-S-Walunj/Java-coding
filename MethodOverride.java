package abc;

class Animal{
	void sound() {
		System.out.println("Animal sounds");
	}
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Dog sound is Bark");
	}
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("Cat sound is Meow");
	}
}
class Cow extends Animal{
	@Override
	void sound() {
		System.out.println("Cow sound is Moo");
	}
}
public class MethodOverride {
public static void main(String[] args) {
	Animal a1=new Animal();
	a1.sound();
	Dog d1=new Dog();
	d1.sound();
	Cat c1=new Cat();
	c1.sound();
	Cow c2=new Cow();
	c2.sound();
}
}
