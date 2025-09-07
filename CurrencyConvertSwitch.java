package abc;
import java.util.Scanner;

public class CurrencyConvertSwitch {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double usdToInr = 83.0;
	        double eurToInr = 90.0;
	        double usdToEur = 0.92;
	        System.out.println("Available currencies: USD, INR, EUR");
	        System.out.print("Enter source currency: ");
	        String from = sc.next().toUpperCase();
	        System.out.print("Enter target currency: ");
	        String to = sc.next().toUpperCase();
	        System.out.print("Enter amount: ");
	        double amount = sc.nextDouble();
	        double result = 0.0;
	        String conversion = from + to;
	        switch (conversion) {
	            case "USDINR":
	                result = amount*usdToInr;
	                break;
	            case "INRUSD":
	                result = amount/usdToInr;
	                break;
	            case "EURINR":
	                result = amount*eurToInr;
	                break;
	            case "INREUR":
	                result = amount/eurToInr;
	                break;
	            case "USDEUR":
	                result = amount*usdToEur;
	                break;
	            case "EURUSD":
	                result = amount / usdToEur;
	                break;
	            default:
	                if (from.equals(to)) {
	                    result = amount;
	                } 
	                else {
	                    System.out.println("Conversion not available.");
	                    return;
	                }
	        }
	        System.out.printf("%.2f %s = %.2f %s\n", amount, from, result, to);
	    }
}
