package abc;
import java.util.Scanner;

public class ArraySearch {
public static void main(String[] args) {
	int key,i,pos=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("How many numbers:");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter the values:");
	for(i=0;i<a.length;i++)
		a[i]=sc.nextInt();
	System.out.println("Enter the key to be searched:");
	key=sc.nextInt();
	for(i=0;i<a.length;i++)
		if(a[i]==key) {
			pos=i;
			break;
		}
		if(i==a.length) {
			System.out.println("key"+key+"not found");
		}else {
			System.out.println("key "+key+" found at position "+ pos);
		}
		sc.close();
}
}
