package abc;

public class SumDo {
public static void main(String[] args) {
	int i=1;
	int sum=0;
	int n=10;
	do {
		System.out.println(i);
		sum+=i;
		i++;
	}
	while(i<=n);
	{
		System.out.println(sum);	
	}
}
}

