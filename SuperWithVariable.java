package com.pqr;

class Car{
	String carName ="I am a Car" ;
}
class Bolero extends Car{
	String carName ="I am Bolero";
	void display()
	{
		System.out.println(this.carName);
		System.out.println(super.carName);
	}
}
public class SuperWithVariable {
	public static void main(String[] args) {
		Bolero b1 = new Bolero();
		b1.display();
	}
}
