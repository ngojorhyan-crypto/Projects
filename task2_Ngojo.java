import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class task2_Ngojo {
 public static void main (String[]args){
    JFrame frame = new JFrame("Simple Calculator"); 
    frame.setSize(350, 250); 
    frame.setLayout(new FlowLayout());

    JLabel label1 = new JLabel("First Number:"); 
    JTextField num1 = new JTextField(10);
    
    JLabel label2 = new JLabel("Second Number:"); 
    JTextField num2 = new JTextField(10);
    JLabel operationLabel = new JLabel("Operation:");
    String[] operations = {"+", "-", "*", "/"};
    JComboBox<String> operationBox = new JComboBox<>(operations);
    JButton calculateButton = new JButton("Calculate");
    JLabel resultLabel = new JLabel("Result: ");

    calculateButton.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) {

            try {
                double number1 = Double.parseDouble(num1.getText());
                double number2 = Double.parseDouble(num2.getText());
                String operation = (String) operationBox.getSelectedItem();
                double result = 0;

            if (operation.equals("+")) { result = number1 + number2; 

            } else if (operation.equals("-")) { result = number1 - number2; 

            } else if (operation.equals("*")) { result = number1 * number2;

             } else if (operation.equals("/")) 
                { if (number2 == 0) {
                     JOptionPane.showMessageDialog( 
                        frame, 
                        "Cannot divide by zero!",
                        "Error", JOptionPane.ERROR_MESSAGE );
                        resultLabel.setText("Result: Error"); 
                        return; 
                    } 
                    result = number1 / number2; 
                }
                

                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numbers.");
                JOptionPane.showMessageDialog(frame, "Input Error", 
                JOptionPane.ERROR_MESSAGE
            ); 
        } 
    } 
});
frame.add(label1); 
frame.add(num1); 
frame.add(label2); 
frame.add(num2); 
frame.add(operationLabel);
 frame.add(operationBox);
 frame.add(calculateButton); 
 frame.add(resultLabel);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
    
}
