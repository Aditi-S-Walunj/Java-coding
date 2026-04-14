package abc;

class MyThread extends Thread {
    String text;
    int n;

    MyThread(String text, int n) {
        this.text = text;
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(text);
        }
    }
}
public class CovidThread {
	   public static void main(String[] args) {

	        MyThread t1 = new MyThread("COVID19", 10);
	        MyThread t2 = new MyThread("LOCKDOWN2020", 20);
	        MyThread t3 = new MyThread("VACCINATED2021", 30);

	        t1.start();
	        t2.start();
	        t3.start();
	    }
}
