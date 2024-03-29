package com.Advance.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaOfCircle extends JFrame implements ActionListener {

    JFrame f = new JFrame("Area of circle");
    JButton b = new JButton("Area");
    JTextField t = new JTextField();
    JTextField t2 = new JTextField();
    JLabel l = new JLabel("Result is : ");

    AreaOfCircle() {
        t.setBounds(33, 33, 66, 22);
        b.setBounds(33, 77, 66, 22);
        l.setBounds(33, 112, 66, 22);
        t2.setBounds(99, 112, 66, 22);
        f.setSize(444, 444);
        f.add(b);
        f.add(t);
        f.add(l);
        f.add(t2);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(this);
    }

    public static void main(String[] args) {
        AreaOfCircle areaOfCircle = new AreaOfCircle();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            int n = Integer.parseInt(t.getText());
            int area = (int) (n * n * 3.14159);
            t2.setText("" + area);
        }
    }
}
