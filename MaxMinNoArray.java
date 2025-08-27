package abc;

public class MaxMinNoArray {
	public static void main(String args[]) {
		int a[]= {10,34,56,-6,35,13,42};
		int max=a[0];
		int min=a[0];
		for(int num:a) {
			if(num>max)
				max=num;
			if(num<min)
				min=num;
		}
		System.out.println("Maximum:"+max+" "+"Minimum:"+min);
	}
}
