package com.abc;

public class Parameterizedcon {
	Parameterizedcon(int a,String b)
	{
		System.out.println(a+"\0"+b);
	}
	Parameterizedcon(String b,int a)
	{
		System.out.println(b+"\0"+a);
	}
	void display() 
	{
	}
public static void main(String[] args) {
	Parameterizedcon p1=new Parameterizedcon(1,"Aditi");
	Parameterizedcon p2=new Parameterizedcon("aditi",1);
	p1.display();
	p2.display();
}
}