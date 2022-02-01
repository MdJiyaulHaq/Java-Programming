package com.Advance.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OddEven extends JFrame implements ActionListener {
    JButton b;
    JTextField t1, t2;

    OddEven() {
        t1 = new JTextField();
        t1.setBounds(33, 33, 55, 22);
        b = new JButton("Identify");
        b.setBounds(33, 66, 99, 22);
        t2 = new JTextField();
        t2.setBounds(33, 99, 55, 22);
        add(b);
        add(t1);
        add(t2);
        b.addActionListener(this);

        setLayout(null);
        setSize(333, 333);
        setVisible(true);
        setTitle("Odd or Even");
    }

    public static void main(String[] args) {
        OddEven oddEven = new OddEven();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            int n = Integer.parseInt(t1.getText());
            if (n % 2 == 0) {
                t2.setText("even");
            } else {
                t2.setText("odd");
            }
        }
    }
}
