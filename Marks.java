package mark.abc;
import java.util.Scanner;

public class Marks {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Marks of Math:-");
	int Math=sc.nextInt();
	System.out.println("Enter The Marks of Science:-");
	int Sci=sc.nextInt();
	System.out.println("Enter The Marks of English:-");
	int Eng=sc.nextInt();
	System.out.println("Marks of Math:"+Math);
	System.out.println("Marks of Sci:"+Sci);
	System.out.println("Marks of Eng:"+Eng);
	System.out.println("Total Marks:-"+(Math+Sci+Eng));
	System.out.println("Average:-"+((Math+Sci+Eng)/2));
    sc.close();
}
}