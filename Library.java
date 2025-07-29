package com.abc;
import java.util.Scanner;

public class Library {
	String title;
    String author;
    double price;
public Library(String title,String author,double price) {
    	 this.title = title;
         this.author = author;
         this.price = price;
    }
 public void displayInfo() {
        System.out.println("\nBook Information:");
        System.out.println("Title :"+ title);
        System.out.println("Author:"+ author);
        System.out.println("Price :$"+ price);
    }
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter book title:");
        String title=sc.nextLine();
        System.out.print("Enter author name:");
        String author=sc.nextLine();
        System.out.print("Enter book price:");
        double price=sc.nextDouble();
        Library book=new Library(title,author,price);
        book.displayInfo();
        sc.close();
   }
}