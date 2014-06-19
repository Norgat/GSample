package GLib;

import javax.swing.*;

/**
 * Created by norgat on 19.06.2014.
 */
public class HForm extends JFrame {
    private JPanel panel1;
    private JButton SAMPLEButton;

    public HForm() {
        super("WORD");
        setContentPane(panel1);
        pack();
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
