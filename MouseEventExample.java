package abc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends JFrame implements MouseListener, MouseMotionListener{
	    JLabel statusLabel;
	 public MouseEventExample() {
	        setTitle("Mouse Event Demo");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());
	        JPanel panel = new JPanel();
	        panel.setBackground(Color.LIGHT_GRAY);
	        panel.addMouseListener(this);
	        panel.addMouseMotionListener(this);
	        statusLabel = new JLabel("Interact with the mouse...");
	        add(panel, BorderLayout.CENTER);
	        add(statusLabel, BorderLayout.SOUTH);
	    }
	    // MouseListener methods
	    public void mouseClicked(MouseEvent e) {
	        statusLabel.setText("Mouse Clicked at [" + e.getX() + ", " + e.getY() + "]");
	    }
	    public void mousePressed(MouseEvent e) {
	        statusLabel.setText("Mouse Pressed");
	    }
	    public void mouseReleased(MouseEvent e) {
	        statusLabel.setText("Mouse Released");
	    }
	    public void mouseEntered(MouseEvent e) {
	        statusLabel.setText("Mouse Entered");
	    }
	    public void mouseExited(MouseEvent e) {
	        statusLabel.setText("Mouse Exited");
	    }
	    // MouseMotionListener methods
	    public void mouseDragged(MouseEvent e) {
	        statusLabel.setText("Mouse Dragged to [" + e.getX() + ", " + e.getY() + "]");
	    }
	    public void mouseMoved(MouseEvent e) {
	        statusLabel.setText("Mouse Moved to [" + e.getX() + ", " + e.getY() + "]");
	    }
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            new MouseEventExample().setVisible(true);
	        });
	    }
}
