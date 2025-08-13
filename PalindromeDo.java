package abc;

public class PalindromeDo {
public static void main(String[] args) {
	int n=17371;
	int original=n;
	int rev=0;
	System.out.println("Original number:"+n);
	do {
		rev=rev*10+n%10;
		n=n/10;
		}
	while(n>0);
		System.out.println("Reverse number:"+rev);
	if(original==rev) {
		System.out.println("Number is palindrome");
		}
	else {
		System.out.println("Number is not palindrome");
		 }
}
}
