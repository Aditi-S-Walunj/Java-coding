package abc;
import javax.swing.*;

public class Frame {
	 public static void main(String[] args)
	    {
	        JFrame frame1 = new JFrame();
	        JButton button1 = new JButton("click");
	        JButton button2 = new JButton("again click");
	        button1.setBounds(160, 150 ,80, 80);
	        button2.setBounds(190, 190, 100, 200);
	        frame1.add(button1);
	        frame1.add(button2);
	        frame1.setSize(400, 500) ;
	        frame1.setLayout(null);
	        frame1.setVisible(true);
	    }
}
