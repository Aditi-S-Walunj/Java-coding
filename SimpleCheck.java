package abc;
import java.util.Scanner;

class EmailId {
    String username;
    String password;
    EmailId() {
        username = "dsk";
        password = "dsk@123";
    }
    EmailId(String u, String p) {
        username = u;
        password = p;
    }
}
public class SimpleCheck {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Username: ");
	        String u = sc.nextLine();
	        System.out.print("Enter Password: ");
	        String p = sc.nextLine();
	        EmailId entered = new EmailId(u, p);
	        EmailId correct = new EmailId();
	        if (entered.username.equals(correct.username)) {
	            System.out.println("Username Matched!");
	        } else {
	            System.out.println("Wrong Username!");
	        }

	        if (entered.password.equals(correct.password)) {
	            System.out.println("Password Matched!");
	        } else {
	            System.out.println("Wrong Password!");
	        }

	        sc.close();
	    }
	}
