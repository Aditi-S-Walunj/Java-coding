package abc;

public class MergeTwoArray {
public static void main(String[] args) {
	int i=0,j=0,k=0;
	int a1[]= {3,5,7,9,14};
	int a2[]= {1,4,10,15,20,25};
	int a3[]=new int[a1.length + a2.length];
	while(i<a1.length && j<a2.length)
		if(a1[i]<a2[j]) {
			a3[k++]=a1[i++];
		}
		else {
			a3[k++]=a2[j++];
		}
	while(i<a1.length)
		a3[k++]=a1[i++];
	while(j<a2.length)
		a3[k++]=a2[j++];
	System.out.println("The merged array is:");
	for(int num:a3)
		System.out.println(num+ "\t");
}
}
