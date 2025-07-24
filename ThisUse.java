package com.Final;

public class ThisUse {
int studId;
String studName;
ThisUse(int studId,String studName) {
	this.studId=studId;
	this.studName=studName;
}
void init(int studId,String studName) {
	this.studId=studId;
	this.studName=studName;	
}
void print() {
	System.out.println("StudId:"+studId+"\nstudName:"+studName);
}
public static void main(String[] args) {
	ThisUse t1=new ThisUse(1,"Aditi");
	t1.print();
}
}