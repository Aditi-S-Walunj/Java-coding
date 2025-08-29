package abc;
import java.util.Scanner;
	
public class AddTwoMatrices {
	private static void accept(int m[][],int r,int c) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the matrix elements:");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				m[i][j]=sc.nextInt();
	}
	private static void display(int m[][],int r,int c) {
		int i,j;
		System.out.println("The matrix is:");
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
		System.out.println(m[i][j]+"\t");
		System.out.println();
	}
	private static void add(int m1[][],int m2[][],int m3[][],int r,int c) {
		int i,j;
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				m3[i][j]=m1[i][j] +m2[i][j];
	}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("How many row and columns:");
int r=sc.nextInt();
int c=sc.nextInt();
int m1[][]=new int[r][c];
accept(m1,r,c);
int m2[][]=new int [r][c];
accept(m2,r,c);
int m3[][]=new int[r][c];
add(m1,m2,m3,r,c);
display(m3,r,c);
sc.close();
}
}