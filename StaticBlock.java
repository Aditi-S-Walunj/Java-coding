package abc;

public class StaticBlock {
	int a;
	static int b;
	static {
		System.out.println("Static block initialized");
		b=10;
	}
	StaticBlock(){
		a=20;
		System.out.println("Constructor Invoked");
	}
	static void method(){
		System.out.println("b = "+b);
	}
	public static void main(String[] args) {
		System.out.println("main function executing...");
		StaticBlock s1=new StaticBlock();
		method();
	}
}
