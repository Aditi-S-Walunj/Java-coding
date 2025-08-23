package com.Inheretance;

class PQR{
	int Id;
	String Name;
PQR(int Id, String Name)
  {
	this.Id = Id;
	this.Name = Name;
	System.out.println(Id);
	System.out.println(Name);
  }
}
public class ThisWithVariable {
	public static void main(String[] args) {
		PQR p1 = new PQR(1,"Sham");
	}
}
