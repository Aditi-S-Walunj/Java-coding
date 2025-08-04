package abc;
import java.util.Scanner;

public class ForEX1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Initial Position:");
	int initial=sc.nextInt();
	System.out.println("Enter Final Position:");
	int Final=sc.nextInt();
	for(int i=initial;i<=Final;i++) {
		System.out.println(i);
	}
	sc.close();
}
}
