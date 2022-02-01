package com.Advance.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChanger extends JFrame implements ActionListener {
    JButton b1, b2, b3;
    JFrame f;

    ColorChanger() {
        f = new JFrame("Change bg color on click");

        b1 = new JButton("Red");
        b1.setBounds(33, 33, 88, 33);
        b1.addActionListener(this);

        b2 = new JButton("Green");
        b2.setBounds(33, 66, 88, 33);
        b2.addActionListener(this);

        b3 = new JButton("Blue");
        b3.setBounds(33, 99, 88, 33);
        b3.addActionListener(this);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(333, 333);
    }

    public static void main(String[] args) {
        ColorChanger cc = new ColorChanger();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            f.getContentPane().setBackground(Color.red);
        } else if (ae.getSource() == b2) {
            f.getContentPane().setBackground(Color.green);
        } else if (ae.getSource() == b3) {
            f.getContentPane().setBackground(Color.blue);
        }
    }
}