package abc;

abstract class Staff {
    protected int id;
    protected String name;
    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
    abstract void display();
}
class OfficeStaff extends Staff {
    String dept;
    OfficeStaff(int id, String name, String dept) {
        super(id, name);
        this.dept = dept;
    }
    void display() {
        System.out.println(id + "\t" + name + "\t" + dept);
    }
}
public class AbstractClassEx {
	  public static void main(String[] args) {
	        OfficeStaff[] staffList = {
	            new OfficeStaff(101, "Aditi", "HR"),
	            new OfficeStaff(102, "Mansi", "IT"),
	            new OfficeStaff(103, "Sakshi", "Finance")
	        };

	        System.out.println("--- Employee Details ---");
	        System.out.println("ID\tName\tDept");
	        for (OfficeStaff staff : staffList) {
	            staff.display();
	        }
	    }
}
