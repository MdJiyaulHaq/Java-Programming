package com.Advance.Swing;

import javax.swing.*;

public class Example extends JFrame {
    JFrame f;

    Example() {
        f = new JFrame("Swing Example");
        JButton b = new JButton("click me");
        b.setBounds(33, 33, 55, 22);
        f.add(b);
        f.setSize(333, 333);
        f.setVisible(true);
        f.setLayout(null);
    }

    public static void main(String[] args) {
        Example e = new Example();
    }
}
