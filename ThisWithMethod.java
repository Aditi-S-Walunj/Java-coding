package com.inheretance;

class SUM{
	void add()
	{
		 System.out.println("I am in Add method");
		 this.Sub();
		 this.display();
	}
	void display()
	{
		System.out.println("I am in Display method");
		
	}
	void Sub()
	{
		System.out.println("I am in Sub method");
		this.display();
	}
}

public class ThisWithMethod {
	public static void main(String[] args) {
		SUM s1 = new SUM();
		s1.add();
	}
}
