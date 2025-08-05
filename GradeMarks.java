//Write a Java program that takes a student's percentage score as input (an integer between 0 and 100). Based on the score, assign a grade using the following criteria:
package abc;
import java.util.Scanner;

public class GradeMarks {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter score:");
	int score=sc.nextInt();
	if(score>=90 && score<=100) {
       System.out.println("A");
	}
	else if(score>=80 && score<=89)
	{
	   System.out.println("B");
	}
	else if(score>=70 && score<=79)
	{
       System.out.println("C");
     }
	else if(score>=60 && score<=69)
	{
       System.out.println("D");
     }
	else if(score<60 )
	{
       System.out.println("F");
     }
	sc.close();
}
}