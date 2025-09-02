package abc;
import java.util.Scanner;

public class FabonacciWhile {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms you want: ");
        int n = sc.nextInt();

        int first = 0, second = 1, count = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        while (count <= n) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            count++;
        }
        sc.close();
    }
}
