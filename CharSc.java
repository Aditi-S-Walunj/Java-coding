package abc;
import java.util.Scanner;

public class CharSc {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter char");
	char ch=sc.next().charAt(4);
	System.out.println(ch);
	sc.close();
}
}
