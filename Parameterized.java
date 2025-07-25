package com.abc;

public class Parameterized {
Parameterized(int a)
{
	System.out.println(a);
}
Parameterized(int a,int b)
{
	System.out.println(a+"\0"+b);
}
Parameterized(int a,int b,int c)
{
	System.out.println(a+"\0"+b+"\0"+c);
}
void display() 
{
}
public static void main(String[] args) {
Parameterized p1=new Parameterized(1);
Parameterized p2=new Parameterized(10,20);
Parameterized p3=new Parameterized(100,200,300);
p1.display();
p2.display();
p3.display();
}
}