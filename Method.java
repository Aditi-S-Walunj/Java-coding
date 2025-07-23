package method;

class Demo{
	void greetUser() {
		System.out.println("Welcome");
	}
	int square(int num) {
		System.out.println("The square of the number is:"+(num*num));
		return 0;
	}
	void showDetails(String name,int age) {
		System.out.println("Your Name:"+name);
		System.out.println("Your Age:"+age);
	}
double getPi() {
	double pi=3.14159;
		System.out.println("The value of Pi:"+pi);
		return 0;
	}
}
public class Method {
	public static void main(String[] args) {
Demo d1=new Demo();
d1.greetUser();
d1.square(2);
d1.showDetails("Aditi",20);
d1.getPi();
}
}