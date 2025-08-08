package abc;
import java.util.Scanner;

public class LargestNo {
void findMax(int a,int b,int c) 
{
}
public static void main(String[] args) {
	LargestNo l1=new LargestNo();
Scanner sc=new Scanner(System.in);	
System.out.println("Enter first number:");
int a=sc.nextInt();
System.out.println("Enter second number:");
int b=sc.nextInt();
System.out.println("Enter third number:");
int c=sc.nextInt();
if(a>b && a>c) {
	 System.out.println("First number is largest");
}
else if(b>a && b>c) {
	 System.out.println("Second number is largest"); 
}
else {
	 System.out.println("Third number is largest"); 
}
l1.findMax(a,b,c);
sc.close();
}
}