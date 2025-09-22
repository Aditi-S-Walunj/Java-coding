package abc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserForm  extends JFrame implements ActionListener{
	  JTextField nameField;
	    JRadioButton fy, sy, ty;
	    JCheckBox music, sports, travelling;
	    JButton submit;
	    JTextArea result;
	  public UserForm() {
	        setTitle("User Information Form");
	        setSize(400, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());
	        // Name label + textfield
	        add(new JLabel("Your Name:"));
	        nameField = new JTextField(15);
	        add(nameField);
	        // Class section
	        add(new JLabel("Your Class:"));
	        fy = new JRadioButton("FY");
	        sy = new JRadioButton("SY");
	        ty = new JRadioButton("TY");
	        ButtonGroup group = new ButtonGroup();
	        group.add(fy);
	        group.add(sy);
	        group.add(ty);
	        add(fy); add(sy); add(ty);
	        // Hobbies section
	        add(new JLabel("Your Hobbies:"));
	        music = new JCheckBox("Music");
	        sports = new JCheckBox("Sports");
	        travelling = new JCheckBox("Travelling");
	        add(music); add(sports); add(travelling);
	        // Submit button
	        submit = new JButton("Submit");
	        submit.addActionListener(this);
	        add(submit);
	        // Result area
	        result = new JTextArea(5, 30);
	        result.setEditable(false);
	        add(result);
	        setVisible(true);
	    }
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        String name = nameField.getText();
	        // Class selection
	        String cls = "";
	        if (fy.isSelected()) cls = "FY";
	        else if (sy.isSelected()) cls = "SY";
	        else if (ty.isSelected()) cls = "TY";
	        // Hobbies selection
	        String hobbies = "";
	        if (music.isSelected()) hobbies += "Music ";
	        if (sports.isSelected()) hobbies += "Sports ";
	        if (travelling.isSelected()) hobbies += "Travelling ";
	        // Show result
	        result.setText("Name: " + name + "\nClass: " + cls + "\nHobbies: " + hobbies);
	    }
	    public static void main(String[] args) {
	        new UserForm();
	    }
	}
