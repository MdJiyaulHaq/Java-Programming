package com.Advance.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSubtract extends JFrame implements ActionListener {
    JButton b1, b2;
    JTextField t1, t2, t3;

    AddSubtract() {
        t1 = new JTextField();
        t1.setBounds(33, 33, 99, 33);
        t2 = new JTextField();
        t2.setBounds(33, 66, 99, 33);
        t3 = new JTextField("Result:");
        t3.setBounds(33, 99, 99, 33);
        b1 = new JButton("Add");
        b1.setBounds(33, 133, 99, 33);
        b2 = new JButton("Subtract");
        b2.setBounds(33, 166, 99, 33);

        add(b1);
        add(b2);
        add(t1);
        add(t2);
        add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);

        setLayout(null);
        setSize(333, 333);
        setVisible(true);
        setTitle("Addition and Subtraction");
    }

    public static void main(String[] args) {
        AddSubtract uc = new AddSubtract();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText("" + (n1 + n2));
        } else if (ae.getSource() == b2) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText("" + (n1 - n2));
        }
    }
}
