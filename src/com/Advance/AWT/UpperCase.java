package com.Advance.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpperCase extends Frame implements ActionListener {
    TextField textField;
    Button button;

    UpperCase() {
        textField = new TextField();
        textField.setBounds(40, 40, 333, 30);
        button = new Button("Upper");
        button.setBounds(40, 90, 100, 30);
        add(textField);
        add(button);
        button.addActionListener(this);
        setSize(666, 666);
        setVisible(true);
        setTitle("UpperCase");
    }

    public static void main(String[] args) {
        UpperCase uc = new UpperCase();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button) {
            String s = textField.getText();
            textField.setText(s.toUpperCase());
        }
    }
}
