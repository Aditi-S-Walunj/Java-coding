package abc;
import java.util.Scanner;

public class Mynumber {
	 private int x;
	public Mynumber() {
	x=0;
	}
	public Mynumber(int x) {
	this.x=x;
	}
	public boolean isNegative() {
	return x<0;
	}
	public boolean isPositive() {
	return x>0;
	}
	public boolean isZero() {
	return x==0;
	} 
	public boolean isOdd() {
	return x%2!=0;
	} 
	public boolean isEven() {
	return x%2==0;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int x=sc.nextInt();
	Mynumber m=new Mynumber(x);
	if(m.isNegative()) {
	System.out.println("Number is negative");
	}
	if(m.isPositive()) {
	System.out.println("Number is positive");
	}
	if(m.isEven()) {
	System.out.println("Number is even");
	}
	if(m.isOdd()) {
	System.out.println("Number is odd");
	}
	if(m.isZero()){
	System.out.println("Number is zero");
	}
	sc.close();
	}
	}