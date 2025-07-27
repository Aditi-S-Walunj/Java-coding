package Demooo;
import java.util.Scanner;

class Product{
	static String category;
Product(int Id,String Name,float Price){
		System.out.println("Product Id:"+Id);
		System.out.println("Product Name:"+Name);
		System.out.println("Product price:"+Price);
		System.out.println("Product category:"+category);
	}
	static {
		category="Electronics";
	}
	void display() {
		System.out.println("Product Id is:");
		System.out.println("Product Name is:");
		System.out.println("Product price is:");
		System.out.println("Product category:");
	}
}
public class Demo {
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
   System.out.println("Enter Product  Id:");
   int Id=sc.nextInt();
   System.out.println("Enter Product  Name:");
   String Name=sc.next();
   System.out.println("Enter Product  Price:");
   float Price=sc.nextFloat();
   Product p1=new Product(Id,Name,Price);
p1.display();
sc.close();
}
}