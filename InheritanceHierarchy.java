package greek;

class Animals                //super class
{
	void display()
	{
		System.out.println("This is Animal");
	}
}
class Dog extends Animals      //sub class
{
	void display1()
	{
		System.out.println("I am Dog");
	}
}
class Cat extends Animals        //sub class
{
	void display2()
	{
		System.out.println("I am Cat");
	}
}
public class InheritanceHierarchy {
	public static void main(String[] args)
	{	
		Dog dog = new Dog();
		dog.display1();
		dog.display();
	    Cat cat = new Cat();
	    cat.display2();
	    cat.display();
	}
}
