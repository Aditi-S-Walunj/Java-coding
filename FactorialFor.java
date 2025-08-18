package abc;
import java.util.Scanner;

public class FactorialFor {
	public static void main(String[] args) {
	int fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
   for(int i=1;i<=n;++i) {
	fact=fact*i;
	System.out.println(fact);
}
   System.out.println("Factorial of"+" "+n+" is:"+fact);
   sc.close();
}
}