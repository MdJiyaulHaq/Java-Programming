package com.Advance.AWT;

import java.awt.*;

public class AWT1 extends Frame {
    AWT1() {
        Button button = new Button("Click Here");
        button.setBackground(Color.red);
        button.setBounds(222, 222, 222, 222);
        add(button);
        setSize(666, 666);
        setTitle("AWT 1");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AWT1 awt1 = new AWT1();
    }
}
