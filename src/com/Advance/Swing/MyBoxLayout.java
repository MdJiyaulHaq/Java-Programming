package com.Advance.Swing;

import javax.swing.*;
import java.awt.*;

public class MyBoxLayout extends Frame {
    Button b1, b2, b3, b4, b5;

    MyBoxLayout() {
        b1 = new Button("East");
        b2 = new Button("West");
        b3 = new Button("North");
        b4 = new Button("South");
        b5 = new Button("Centre");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(333, 333);
        setVisible(true);
        setTitle("BoxLayout Example");
    }

    public static void main(String[] args) {
        MyBoxLayout boxLayout1 = new MyBoxLayout();
    }
}
