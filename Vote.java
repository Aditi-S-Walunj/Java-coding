package vote;
import java.util.Scanner;
public class Vote {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Age:");
	int a=sc.nextInt();
	if(a>18) {
		System.out.println("You can vote");
	}
	else
	{
		System.out.println("You can't vote");
	}
	sc.close();
	}
}
