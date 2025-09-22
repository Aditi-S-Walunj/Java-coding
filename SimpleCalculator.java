package abc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener{
	 private JTextField resultField;
	    private double firstNumber, secondNumber, result;
	    private String operator;
	    public SimpleCalculator() {
	        setTitle("Simple Calculator");
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());
	        resultField = new JTextField(20);
	        resultField.setEditable(false);
	        resultField.setHorizontalAlignment(JTextField.RIGHT);
	        add(resultField, BorderLayout.NORTH);

	        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
	        String[] buttonLabels = {
	            "7", "8", "9", "/",
	            "4", "5", "6", "*",
	            "1", "2", "3", "-",
	            "0", ".", "=", "+"
	        };
	        for (String label : buttonLabels) {
	            JButton button = new JButton(label);
	            button.addActionListener(this);
	            buttonPanel.add(button);
	        }
	        add(buttonPanel, BorderLayout.CENTER);
	        setVisible(true);
	    }
	    public void actionPerformed(ActionEvent e) {
	        String command = e.getActionCommand();
	        if (Character.isDigit(command.charAt(0)) || command.equals(".")) {
	            resultField.setText(resultField.getText() + command);
	        } else if (command.equals("=")) {
	            try {
	                secondNumber = Double.parseDouble(resultField.getText());
	                switch (operator) {
	                    case "+":
	                        result = firstNumber + secondNumber;
	                        break;
	                    case "-":
	                        result = firstNumber - secondNumber;
	                        break;
	                    case "*":
	                        result = firstNumber * secondNumber;
	                        break;
	                    case "/":
	                        if (secondNumber == 0) {
	                            resultField.setText("Error: Division by zero");
	                            return;
	                        }
	                        result = firstNumber / secondNumber;
	                        break;
	                }
	                resultField.setText(String.valueOf(result));
	            } catch (NumberFormatException ex) {
	                resultField.setText("Error");
	            }
	        } else {
	            try {
	                firstNumber = Double.parseDouble(resultField.getText());
	                operator = command;
	                resultField.setText("");
	            } catch (NumberFormatException ex) {
	                resultField.setText("Error");
	            }
	        }
	    }
	    public static void main(String[] args) {
	        new SimpleCalculator();
	    }
}
