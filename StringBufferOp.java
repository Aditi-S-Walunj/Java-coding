package abc;

public class StringBufferOp {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		System.out.println("length of s1= "+s1.length());
		System.out.println("capacity of s1= "+s1.capacity());
		StringBuffer s2=new StringBuffer("java");
		System.out.println("length of s2= "+s2.length());
		System.out.println("capacity of s2= "+s2.capacity());
		s2.append("program");
		System.out.println("after appending s2 = "+ s2);
		s2.insert(0, "simple");
		System.out.println("after inserting s2 = "+ s2);
		s2.delete(6, 10);
		System.out.println("after deleting s2 = "+ s2);
		s2.reverse();
		System.out.println("after reversing s2 = "+ s2);
	}
}
