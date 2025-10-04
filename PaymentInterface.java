package abc;

interface Payment{
	void pay(double amount);
	void refund(double amount);
}
class CreditCardPayment implements Payment{
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit Card.");
	}
	public void refund(double amount) {
		 System.out.println("Refunded ₹" + amount + " to Credit Card.");
	}
}
class UPIpayment implements Payment{
	@Override
	public void pay(double amount) {
		 System.out.println("Paid ₹" + amount + " using UPI.");
	}	
   public void refund(double amount) {
	   System.out.println("Refunded ₹" + amount + " to UPI account.");	
	}
}
public class PaymentInterface {
public static void main(String[] args) {
	CreditCardPayment c1=new CreditCardPayment();
	 c1.pay(1000);
     c1.refund(300);
     UPIpayment u1=new UPIpayment();
     u1.pay(500);
     u1.refund(100);
}
}
