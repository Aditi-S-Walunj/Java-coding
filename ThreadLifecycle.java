package abc;

class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        try {
            int time = (int)(Math.random() * 5000);
            System.out.println(name + " created, sleeping for " + time + " ms");
            
            Thread.sleep(time);
            
            System.out.println(name + " finished (dead)");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class ThreadLifecycle {
	  public static void main(String[] args) {
	        MyThread t1 = new MyThread("Thread-1");
	        MyThread t2 = new MyThread("Thread-2");
	        MyThread t3 = new MyThread("Thread-3");

	        t1.start();
	        t2.start();
	        t3.start();
	    }
}
