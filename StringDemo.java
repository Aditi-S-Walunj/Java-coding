package abc;

public class StringDemo {
public static void main(String[] args) {
	String s1=new String();
	System.out.println("s1= "+s1);
	char a[]= {'a','b','c','d','e','f','g'};
	String s2=new String(a);
	System.out.println("s2= "+s2);
	String s3=new String(s2);
	if(s2==s3)
		System.out.println("s2 and s3 are equal reference");
	if(s2.equals(s3))
		System.out.println("s2 and s3 have same contents");
	System.out.println(s2+ " start with abc= "+ s2.startsWith("abc"));
	System.out.println(s2+ " end with efg= "+ s2.endsWith("abc"));
	String s4="This is original";
	System.out.println("s4 ="+ s4);
	System.out.println("After Replacing i by x");
	String s5=s4.replace('i','x');
	System.out.println("s4= "+s4);
	System.out.println("s5= "+s5);
}
}