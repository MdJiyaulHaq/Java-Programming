package com.Advance.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpperCase extends JFrame implements ActionListener {
    JButton b;
    JTextField t1;

    UpperCase() {
        t1 = new JTextField();
        t1.setBounds(33, 33, 99, 33);
        b = new JButton("To UpperCase");
        b.setBounds(33, 66, 99, 33);

        add(b);
        add(t1);
        b.addActionListener(this);

        setLayout(null);
        setSize(333, 333);
        setVisible(true);
        setTitle("Odd or Even");
    }

    public static void main(String[] args) {
        AddSubtract uc = new AddSubtract();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            b.setBackground(Color.GREEN);
            String s = t1.getText();
            t1.setText(s.toUpperCase());
        }
    }
}
