package greek;

class Animal{
	String name;
	int age;
	String type;
	Animal(){
		
	}
	Animal(String name,int age,String type)
	{
		this.name=name;
		this.age=age;
		this.type=type;
	}
	void displayDetails()
	{
		System.out.println("Anaimal name:" + name);
		System.out.println("Animal age:" + age);
		System.out.println("Animal type:" + type);
		System.out.println(" ");
	}
}
class Carnivorous extends Animal 
{
    void display() 
    {
	    System.out.println("Carnivorous : Eats Animals.");
    }
}
class Herbivorous extends Carnivorous
{
    void display1() 
     {
	     System.out.println("Herbivorous : Eats Plants and Vegetables.");
	 }
}

class Amphibians extends Herbivorous 
{
	 void display2() 
	 {
	     System.out.println("Amphibians :  lives in land and water.");
	}
}

class Reptiles extends Amphibians
{
	void display3() 
	{
	   System.out.println("Reptiles :  lives in land ,water ,deserts ,forest..etc");
	}
}

class Aquatic extends Reptiles
{
    void display4()
    {
	    System.out.println("Aquatic :  lives only in water. ");
    }
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		Animal a1 = new Animal("dog",2,"Carnivorous");
		a1.displayDetails();
		 Aquatic fish= new Aquatic();
	     fish.display();
	     fish.display1();
	     fish.display2();
	     fish.display3();
	     fish.display4();
	}
}