//Convert Temperature Between Celsius and Fahrenheit Use switch-case to select the conversion type.
package abc;
import java.util.Scanner;

public class Temperature 
{
	public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter conversion type(Fahreinheit-->Celsius OR Celsius-->Fahrenheit)");
		String type=sc.next();
		System.out.println("Enter temperature:");
		int temp=sc.nextInt();	
	switch(type)
	{
		case "Fahreinheit-->Celsius":		
			                System.out.println("Temperature in Fahreinheit:"+(temp*9/5+32));
		break;
		case "Celsius-->Fahrenheit": 
			                System.out.println("Temperature in Celsius:"+((temp-32)*5/9));
		break;	                
	    default:  System.out.println("Method not found");
    }
	 sc.close();
}
}