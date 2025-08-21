package abc;

class BCS{
	int CourseCode;
	String CourseName;
BCS(){
	this(101,"Java");
}
BCS(int CourseCode,String CourseName){
	this.CourseCode=CourseCode;
	this.CourseName=CourseName;
}
void display(){
System.out.println(CourseCode);
System.out.println(CourseName);
}
}
public class Thisex {
public static void main(String[] args) {
	BCS b1=new BCS();
	b1.display();
	BCS b2=new BCS(102,"Full Stack");
	b2.display();
}
}
