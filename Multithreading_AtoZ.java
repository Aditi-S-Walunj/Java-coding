package abc;

class AlphabetThread extends Thread {
    public void run() {
        for(char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
            try {
                Thread.sleep(2000); // 2 seconds delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Multithreading_AtoZ {
	 public static void main(String[] args) {
	        AlphabetThread t = new AlphabetThread();
	        t.start(); // start thread
	    }
}
