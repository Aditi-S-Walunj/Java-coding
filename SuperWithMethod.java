package com.pqr;

class Animal{
void eat(){
		System.out.println("Animal can eat");
	}
void add(int a,int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
}
class Tiger extends Animal{
void eat(){
		System.out.println("Tiger Eats Meat");
		super.add(3,6);
	}
}
public class SuperWithMethod {
public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.eat();
	}
}