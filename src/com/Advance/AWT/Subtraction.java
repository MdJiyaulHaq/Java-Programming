package com.Advance.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Subtraction extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Button b;
    Frame f;

    Subtraction() {
        f = new Frame();
        t1 = new TextField(11);
        t1.setBounds(33, 44, 44, 22);
        t2 = new TextField(11);
        t2.setBounds(33, 77, 44, 22);
        t3 = new TextField(11);
        t3.setBounds(33, 109, 44, 22);
        b = new Button("Subtract");
        b.setBounds(88, 109, 88, 22);

        b.addActionListener(this);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(444, 444);
        f.setTitle("Subtraction using AWT");
    }

    public static void main(String[] args) {
        Subtraction s = new Subtraction();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(" " + (n1 - n2));
        }
    }
}
