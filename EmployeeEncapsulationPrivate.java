package abc;

class Employee{
	private int EmpId;
	private String EmpName;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
}
public class EmployeeEncapsulationPrivate {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmpId(100);
		e1.setEmpName("adi");
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
}
}