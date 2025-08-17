package abc;

public class TablesWhile {
	public static void main(String[] args) {
	int n=1;
	while(n<=15) {
		int i=1;
		System.out.println("Table of"+n);
	while(i<=10) {
		System.out.println(n+"*"+i+"="+n*i);
		i++;
	}
	System.out.println();
	n++;
	}
}
}