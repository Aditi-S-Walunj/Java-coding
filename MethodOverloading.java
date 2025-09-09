package abc;

class Calculator{
	void add(int a,int b) {
		System.out.println(a +" ,"+ b);
	}
	void add(double a,double b) {
		System.out.println(a +" ,"+ b);
	}
	void add(int a,String b) {
		System.out.println(a +" ,"+ b);
	}
	void add(String a,int b) {
		System.out.println(a +" ,"+ b);
	}
}
public class MethodOverloading {
public static void main(String[] args) {
Calculator c1=new Calculator();
c1.add(101,102);
c1.add(2.22,4.33);
c1.add(11,"ADI");
c1.add("ADI",11);
}
}
