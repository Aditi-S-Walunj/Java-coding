package abc;
import java.util.Scanner;

public class BankAcc {
static void ShowBankName(String BankName){
		System.out.println("Bank Name is:"+BankName);
	}
void displayBalance(){
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Bank Balance:");
	float balance=sc.nextFloat();
	System.out.println("Bank Balance:"+balance);
	sc.close();
	ShowBankName("HDFC");
	}
}