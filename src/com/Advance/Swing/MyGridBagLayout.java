package com.Advance.Swing;

import javax.swing.*;
import java.awt.*;

public class MyGridBagLayout extends JFrame {
    JButton b1, b2, b3, b4, b5;
    GridBagConstraints gbc = new GridBagConstraints();

    MyGridBagLayout() {
        setLayout(new GridBagLayout());
        b1 = new JButton("Button 1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 5;
        gbc.fill = GridBagConstraints.VERTICAL;
        add(b1, gbc);
        b2 = new JButton("Button 2");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        add(b2, gbc);
        b3 = new JButton("Button 3");
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        add(b3, gbc);
        b4 = new JButton("Button 4");
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        add(b4, gbc);
        b5 = new JButton("Button 5");
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(b5, gbc);

        setSize(666, 666);
        setVisible(true);
        setTitle("GridBagLayout Example");
    }

    public static void main(String[] args) {
        MyGridBagLayout g = new MyGridBagLayout();
    }
}
