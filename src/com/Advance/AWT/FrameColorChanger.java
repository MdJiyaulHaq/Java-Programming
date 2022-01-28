package com.Advance.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameColorChanger extends Frame implements ActionListener {
    Button b1, b2, b3;
    Frame f;

    FrameColorChanger() {
        f = new Frame();
        b1 = new Button("RED");
        b2 = new Button("GREEN");
        b3 = new Button("BLUE");
        b1.setBounds(44, 66, 44, 22);
        b2.setBounds(44, 99, 44, 22);
        b3.setBounds(44, 132, 44, 22);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        f.setTitle("Frame color changer");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(333, 333);
    }

    public static void main(String[] args) {
        FrameColorChanger fc = new FrameColorChanger();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            f.setBackground(Color.red);
        } else if (ae.getSource() == b2) {
            f.setBackground(Color.green);
        } else if (ae.getSource() == b3) {
            f.setBackground(Color.blue);
        }
    }
}
