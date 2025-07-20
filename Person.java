package person;

public class Person {
   Person(String name,int age){
	System.out.println("Name of The Person is:"+name);
	System.out.println("Age of The Person is:"+age);
}
   void display() {
   }
   public static void main(String[] args) {
	   Person p1=new Person("Aditi",20);
	   Person p2=new Person("Mansi",19);
       p1.display();
       p2.display();
   }
}
