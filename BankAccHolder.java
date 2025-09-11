package abc;

public class BankAccHolder {
private String AccHolderName;
private long BankAccNo;
private String BankIFSCcode;
private String BankBranch;
private String Email;
public void setEmail(String email) {
	if(email.contains("@")&& email.contains(".com")){
		Email=email;
	}
	else {
		System.out.println("Email is Invalid");
	}
}
public String getEmail() {
	return Email;
}
public String getAccHolderName() {
	return AccHolderName;
}
public void setAccHolderName(String accHolderName) {
	AccHolderName = accHolderName;
}
public long getBankAccNo() {
	return BankAccNo;
}
public void setBankAccNo(long bankAccNo) {
	BankAccNo = bankAccNo;
}
public String getBankIFSCcode() {
	return BankIFSCcode;
}
public void setBankIFSCcode(String bankIFSCcode) {
	BankIFSCcode = bankIFSCcode;
}
public String getBankBranch() {
	return BankBranch;
}
public void setBankBranch(String bankBranch) {
	BankBranch = bankBranch;
}
public static void main(String[] args){
	BankAccHolder b1=new BankAccHolder();
	b1.setAccHolderName("Adi");
	b1.setBankAccNo(1234);
	b1.setBankIFSCcode("xyz");
	b1.setBankBranch("abc");
	b1.setEmail("aditi@gmail.com");
	System.out.println(b1.getAccHolderName());
	System.out.println(b1.getBankAccNo());
	System.out.println(b1.getBankIFSCcode());
	System.out.println(b1.getBankBranch());
	System.out.println(b1.getEmail());
}
}