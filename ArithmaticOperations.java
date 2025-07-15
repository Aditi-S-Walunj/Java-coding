package ASMDR;

class operations{
	void insert(int a,int b)
	{
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int g=a%b;
		System.out.println("Addition:"+c);
		System.out.println("subtraction:"+d);
		System.out.println("multiplication:"+e);
		System.out.println("Division:"+f);
		System.out.println("Module:"+g);
	}
}
public class ArithmaticOperations {
	public static void main(String[] args)
	{
		operations o1=new operations();
		o1.insert(9,10);	
	}
}