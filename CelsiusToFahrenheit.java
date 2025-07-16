package temp;

class CToF{
	void insert(int celsius)
	{
	int fahrenheit=(celsius*9/5)+32;
	System.out.println("temperature in fahrenheit:"+fahrenheit);
	}
}
public class CelsiusToFahrenheit {
public static void main(String[] args)
{
	CToF c1=new CToF();
	c1.insert(99);
}
}