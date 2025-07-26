package com.abc;
import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		int num2=sc.nextInt();
		System.out.println("Enter Third Number:");
		int num3=sc.nextInt();
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Number 1 is Maximum:");
		    }
		    else
		    {
			    System.out.println("Number 3 is Maximum:");	
		   }
		}
		else
		{
			System.out.println("Number 3 is Maximum:");
		}
		sc.close();
}
}