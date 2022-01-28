package com.Advance.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition extends Frame implements ActionListener {
    Label label1, label2, label3;
    TextField textField1, textField2, textField3;
    Button button;

    Addition() {
        label1 = new Label("Number 1:");
        label1.setBounds(30, 30, 50, 20);
        textField1 = new TextField();
        textField1.setBounds(90, 30, 50, 20);

        label2 = new Label("Number 2:");
        label2.setBounds(30, 60, 50, 20);
        textField2 = new TextField();
        textField2.setBounds(90, 60, 50, 20);

        label3 = new Label("Result");
        label3.setBounds(30, 100, 50, 20);
        textField3 = new TextField();
        textField3.setBounds(90, 100, 50, 20);

        button = new Button("Sum");
        button.setBounds(160, 100, 50, 20);

        add(label1);
        add(label2);
        add(label3);
        add(textField1);
        add(textField2);
        add(textField3);
        add(button);
        button.addActionListener(this);

        setSize(444, 444);
        setTitle("Addition");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Addition add = new Addition();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button) {
            int n1 = Integer.parseInt(textField1.getText());
            int n2 = Integer.parseInt(textField2.getText());
            textField3.setText(" " + (n1 + n2));
        }
    }
}
