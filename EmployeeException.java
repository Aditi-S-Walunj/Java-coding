package abc;
import java.util.Scanner;

class NameisInvalid extends Exception {
    String msg = "\nInvalid Name....\nName should contain only characters\nThank You :)\n";
    public String toString() {
        return msg;
    }
}
class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
}
public class EmployeeException {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Name :");
	        String name = sc.nextLine();
	        try {
	            if (!name.matches("[A-Za-z]+")) {
	                throw new NameisInvalid();
	            }
	            Employee emp = new Employee(name);
	            System.out.println("\nEmployee Name:- " + emp.name + "\n");
	        } catch (NameisInvalid e) {
	            System.out.println(e);
	        }
	        sc.close();
	    }
}
