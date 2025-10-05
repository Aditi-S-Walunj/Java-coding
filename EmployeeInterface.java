package abc;

class Employee{
  String name;
   Employee(String name) {
	   this.name = name;
	 }
}
interface Workable{
   void work();
}
interface Payable{
    void getSalary(double salary);
}
class Manager extends Employee implements Workable,Payable{
   Manager(String name){
		super(name);
	}
	@Override
	public void work(){
	   System.out.println(name + " is managing the team and planning meetings.");
	}
	public void getSalary(double salary) {
	   System.out.println(name + " receives a salary of ₹" + salary);
	}
}
class Developer extends Employee implements Workable,Payable{
	Developer(String name){
		super(name);
	}
	@Override
	public void work(){
	   System.out.println(name + " is writing and debugging code.");
	}
	public void getSalary(double salary) {
	   System.out.println(name + " receives a salary of ₹" + salary);
	}
}
public class EmployeeInterface {
public static void main(String[] args) {
	   Workable w1 = new Manager("Aditi");
       Workable w2 = new Developer("Mansi");
       w1.work();
       w2.work();
	   Payable p1 = new Manager("Aditi");
	   Payable p2 = new Manager("Mansi");
	   p1.getSalary(80000);
       p2.getSalary(60000);  
}
}
