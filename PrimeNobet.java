package abc;

public class PrimeNobet {
	private static boolean isPrime(int n){
		int i;
		for(i=2;i<n;i++)
			if(n%i==0)
				return false;
		return true;
	}
public static void main(String[] args) {
	int n;
	for(n=2;n<=100;n++)
		if(isPrime(n))
			System.out.print(n+" , ");
}
}
