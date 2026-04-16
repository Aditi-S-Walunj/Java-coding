//6.  Write a java program using Multithreading to accept a String from a user and display each vowel from a  
//String after every 3 seconds.
package abc;
import java.util.Scanner;

class VowelThread extends Thread {
    String str;
    VowelThread(String str) {
        this.str = str;
    }
    public void run() {
        try {
            for (int i = 0; i < str.length(); i++) {
                char ch = Character.toLowerCase(str.charAt(i));
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                    System.out.println(ch);
                    Thread.sleep(3000); // 3 sec delay
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class VowelInputThread {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter String: ");
	        String s = sc.nextLine();
	        VowelThread t = new VowelThread(s);
	        t.start();
	    }
}
