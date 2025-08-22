package greek;

class Cars{
String name="Audi";
long number=4896;
   void display() {
	System.out.println("car name:"+name);
	System.out.println("car number:"+number);
     }
}
class Audi extends Cars{
	void display1() {
		System.out.println("I am Audi");
	}
}
public class SingleLevelInheritance {
public static void main(String[] args) {
	Audi a1=new Audi();
	a1.display();
	a1.display1();
}
}
