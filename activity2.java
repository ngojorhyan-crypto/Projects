import javax.swing.*;
import java.awt.event.*;

public class activity2-Ngojo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Activity");
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button is clicked!");
            }
        });

        frame.add(button);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }