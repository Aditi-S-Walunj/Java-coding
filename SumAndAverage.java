package abc;
import java.util.Scanner;

public class SumAndAverage {
	public static void main(String args[]) {
		int sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers:");
		for(int i=1;i<=n;i++) {
			int num=sc.nextInt();
			sum=sum+num;
		}
		    avg=(float)sum/n;
		System.out.println("Sum="+sum);
		System.out.printf("Average=%.2f",avg);
		sc.close();
	}
}