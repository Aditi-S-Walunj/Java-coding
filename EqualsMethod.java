package abc;

public class EqualsMethod {
	int rno;
	String name;
	 EqualsMethod(int rno, String name) {
	        this.rno = rno;
	        this.name = name;
	    }
	public boolean equals(Object obj) {
	 EqualsMethod m1=(EqualsMethod) obj;
	 return (rno==m1.rno)&&(name.equals(m1.name));
	}
	public static void main(String[] args) {
		 EqualsMethod m2=new EqualsMethod(10,"ABC");
		 EqualsMethod m3=new EqualsMethod(10,"ABC");
		 if(m2.equals(m3))
			 System.out.println("Equal contents");
		 else
			 System.out.println(" Not Equal contents");
	}
}
