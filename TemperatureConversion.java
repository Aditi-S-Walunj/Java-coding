//Create a class TemperatureConverter with static methods to convert:Celsius to Fahrenheit,Fahrenheit to Celsius
package abc;

public class TemperatureConversion {
	static int temp=27;
	static {
		System.out.println("Celcius To Farhreneit"+(temp-32*5/9));
		System.out.println("Fahreinheit To Celsius:"+(temp*9/5+32));
	}
public static void main(String[] args) {
}
}
