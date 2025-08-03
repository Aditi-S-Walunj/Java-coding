//check if a Number is Prime Take a number and check if it is prime using if-else
package abc;
import java.util.Scanner;

public class PrimeNo {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	boolean isPrime = true;
 if (num <= 1){
	   isPrime = false;
	   } 
else {
	 for (int i = 2; i < num; i++){
	   if (num % i == 0) {
	       isPrime = false;
	       break;
	       }
	    }
	 }
	    if (isPrime){
	            System.out.println("Number is prime");
	        } 
	    else{
	            System.out.println("Number is not prime");
	        }
sc.close();
}
}