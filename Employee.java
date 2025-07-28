package abc;

class OfficialDetails{
	int EmpId;
	String EmpName;
	String EmpDesig;
	float EmpSal;
	String EmpDept;
	boolean EmpStatus;
void insert(int EmpId,String EmpName,String EmpDesig,float EmpSal,String EmpDept,boolean EmpStatus) 
    {
	System.out.println(EmpId);
	System.out.println(EmpName);	
	System.out.println(EmpDesig);	
	System.out.println(EmpSal);	
	System.out.println(EmpDept);
	System.out.println(EmpStatus);	
	}
void display() {
}
}
class PersonalDetails{
	long AdharNo;
	long MobileNo;
	String PanNo;
	String Address;
void insert(long AdharNo,long MobileNo,String PanNo,String Address) 
    {	
	System.out.println(AdharNo);	
	System.out.println(MobileNo);	
	System.out.println(PanNo);	
	System.out.println(Address);	
	}
void display() {	
}
}
public class Employee {
public static void main(String[] args) {
	OfficialDetails o1=new OfficialDetails();
	PersonalDetails p1=new PersonalDetails();
	o1.insert(101,"aditi","xyz",2000f,"abc",true);
	p1.insert(1234567123,1234567895,"xyzabc","Sangamner");
	o1.display();
	p1.display();
}
}