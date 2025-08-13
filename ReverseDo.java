package abc;

public class ReverseDo {
	public static void main(String[] args) {
		int n=12345;
		int rev=0;
		System.out.println("Original number:"+n);
		do {
			rev=rev*10+n%10;
			n=n/10;
			}
		while(n>0);
		System.out.println("Reverse number:"+rev);
}
}