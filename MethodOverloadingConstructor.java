package abc;

class Student{
Student(String name){
	System.out.println(name);	
	}
Student(String name,int Rno){
	System.out.println(name+" ,"+Rno);	
}
Student(String name,int Rno,double marks){
	System.out.println(name+", "+Rno+" ,"+marks);	
}
}
public class MethodOverloadingConstructor {
public static void main(String[] args) {
Student s1=new Student("Adi");
Student s2=new Student("Adi",101);
Student s3=new Student("Adi",101,9.55);
}
}
