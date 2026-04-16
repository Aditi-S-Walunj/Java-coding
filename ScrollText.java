package abc;

import javax.swing.*;

public class ScrollText extends JFrame implements Runnable{
	  JLabel label;
	    String text = " Welcome to Multithreading in Java ";
	    int x = 0;

	    ScrollText() {
	        label = new JLabel(text);
	        add(label);

	        setSize(400, 100);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);

	        Thread t = new Thread(this);
	        t.start();
	    }

	    public void run() {
	        try {
	            while (true) {
	                text = text.substring(1) + text.charAt(0);
	                label.setText(text);
	                Thread.sleep(200);
	            }
	        } catch (Exception e) {}
	    }

	    public static void main(String[] args) {
	        new ScrollText();
	    }
	}
