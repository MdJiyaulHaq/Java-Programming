package com.Advance.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling1 extends Frame implements ActionListener {
    TextField textField;

    EventHandling1() {
        textField = new TextField();
        textField.setBounds(60, 50, 170, 20);
        Button button = new Button("click me");
        button.setBounds(100, 120, 80, 30);
        button.addActionListener(this);
        add(textField);
        add(button);
        setSize(333, 333);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventHandling1();
    }

    public void actionPerformed(ActionEvent ae) {
        textField.setText("Welcome Md");
    }
}
