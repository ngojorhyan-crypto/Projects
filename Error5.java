import javax.swing.*;
import java.awt.event.*;

public class Error5 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Error Demo");

        final JCheckBox cb = new JCheckBox("Check");

        cb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

                if (cb.isSelected()) {
                    System.out.println("Selected");
                }

            }
        });

        frame.add(cb);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}