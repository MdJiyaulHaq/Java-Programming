package com.Advance.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonColorChanger extends Frame implements ActionListener {
    Button b1, b2, b3;

    ButtonColorChanger() {
        b1 = new Button("RED");
        b2 = new Button("GREEN");
        b3 = new Button("BLUE");
        b1.setBounds(44, 66, 44, 22);
        b2.setBounds(44, 99, 44, 22);
        b3.setBounds(44, 132, 44, 22);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setTitle("Button color changer");
        setLayout(null);
        setVisible(true);
        setSize(333, 333);
    }

    public static void main(String[] args) {
        ButtonColorChanger bc = new ButtonColorChanger();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            b1.setBackground(Color.red);
        } else if (ae.getSource() == b2) {
            b2.setBackground(Color.green);
        } else if (ae.getSource() == b3) {
            b3.setBackground(Color.blue);
        }
    }
}
