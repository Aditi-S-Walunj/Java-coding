package var;

public class Varr {
		static String Name;
		static int RollNo;
		static int Age;
		void display() {
			System.out.println("Your name is:"+Name);	
			System.out.println("Your Roll No is:"+RollNo);	
			System.out.println("Your Age is:"+Age);
		}
public static void main(String[] args){
	Varr v1=new Varr();
	Varr.Name="Aditi";
	Varr.RollNo=95;
	Varr.Age=20;
	v1.display();
}
}