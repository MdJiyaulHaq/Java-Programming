package com.Advance.Swing;

import javax.swing.*;
import java.awt.*;

public class MyFlowLayout {

    JFrame f;

    MyFlowLayout() {
        f = new JFrame();

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);

        f.setLayout(new FlowLayout());
        f.setSize(333, 333);
        f.setVisible(true);
        f.setTitle("Flowlayout Example");
    }

    public static void main(String[] args) {
        MyFlowLayout flowLayout = new MyFlowLayout();
    }
}