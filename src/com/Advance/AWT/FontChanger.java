package com.Advance.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontChanger extends Frame implements ActionListener {
    Checkbox c1, c2, c3;
    TextField t1, t2, t3;

    FontChanger() {
        c1 = new Checkbox("Bold");
        c1.setBounds(30, 30, 50, 20);
        t1 = new TextField();
        t1.setBounds(90, 30, 50, 20);

        c2 = new Checkbox("Italic");
        c2.setBounds(30, 60, 50, 20);
        t2 = new TextField();
        t2.setBounds(90, 60, 50, 20);

        c3 = new Checkbox("Plain");
        c3.setBounds(30, 90, 50, 20);
        t3 = new TextField();
        t3.setBounds(90, 90, 50, 20);

        add(c1);
        add(c2);
        add(c3);
        add(t1);
        add(t2);
        add(t3);

        setTitle("Font Changer");
        setVisible(true);
        setSize(666, 666);
        setLayout(null);
    }

    public static void main(String[] args) {
        FontChanger fc = new FontChanger();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == c1) {
            String s1 = t1.getText();
            Font f1 = new Font("Bold", Font.BOLD, 22);
            t2.setFont(f1);
        } else if (ae.getSource() == c2) {
            String s2 = t2.getText();
            Font f2 = new Font("Italic", Font.ITALIC, 22);
            t2.setFont(f2);
        } else if (ae.getSource() == c3) {
            String s3 = t3.getText();
            Font f3 = new Font("Plain", Font.PLAIN, 22);
            t3.setFont(f3);
        }
    }
}