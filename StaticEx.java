package com.Final;

public class StaticEx {
static {
	
}
static int SID=40;
static void demo() {
}
int b=20;
public static void main(String[] args) {
	StaticEx s1=new StaticEx();
	System.out.println("SID is:");
	System.out.println(SID);
	System.out.println("value of b is:");
	System.out.println(s1.b);
	demo();
}
}
