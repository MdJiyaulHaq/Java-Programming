package com.Advance.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCardLayout extends JFrame implements ActionListener {
    JButton b1, b2, b3;
    Container cPane;
    CardLayout cdl;

    MyCardLayout() {
        cPane = getContentPane();
        cdl = new CardLayout();
        cPane.setLayout(cdl);
        b1 = new JButton("Button 1");
        b1.addActionListener(this);
        b2 = new JButton("Button 2");
        b2.addActionListener(this);
        b3 = new JButton("Button 3");
        b3.addActionListener(this);
        cPane.add("a", b1);
        cPane.add("b", b2);
        cPane.add("c", b3);
    }

    public static void main(String[] args) {
        MyCardLayout myCardLayout = new MyCardLayout();
        myCardLayout.setSize(333, 333);
        myCardLayout.setVisible(true);
        myCardLayout.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        cdl.next(cPane);
    }
}
