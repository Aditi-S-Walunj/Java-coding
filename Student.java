package abc;

public class Student {
	String name;
	int rollNo;
	Student(String name,int rollNo){
	}
	void display() {
		System.out.println("Name of the student is:"+name);
		System.out.println("Roll No of the student is:"+rollNo);
	}
	static {
		System.out.println("I am student of SMBST");
	}
public static void main(String[] args) {
	Student s1=new Student("Aditi",98);
	s1.display();
}
}
