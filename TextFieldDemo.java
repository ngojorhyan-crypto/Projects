import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TextFieldDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("TextField Demo");

        final JTextField tf = new JTextField(15);
        JButton btn = new JButton("Print");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(tf.getText());
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(tf);
        frame.add(btn);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}