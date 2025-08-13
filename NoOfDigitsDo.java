package abc;

public class NoOfDigitsDo {
public static void main(String[] args) {
	int n=12345;
	int count=0;
	System.out.println("Number:"+n);
	do {
		n=n/10;
		count++;
	}
	while(n>0);
	System.out.println("Number of digits:"+count);
}
}