package com.abc;
import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name:");
		String UserName=sc.next();
		System.out.println("Enter Password:");
		String pass=sc.next();
		if(UserName.equals(pass))
		{
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("Login Unsuccessfully");
		}
		sc.close();
	}
}
