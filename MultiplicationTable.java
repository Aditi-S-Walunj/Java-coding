package abc;

public class MultiplicationTable {
public static void main(String[] args) {
	int n=1;
	do {
		int i=1;
		System.out.println("--------------------");
		 System.out.println("Table of"+n);
		do {
		System.out.println(n+"*"+i+"="+i*n);
		i++;
		}
	    while(i<=10);
	    {
	      n++;
         }
	}
	    while(n<=15);
}
}