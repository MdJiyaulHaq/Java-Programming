package com.Advance.AWT;

import java.awt.*;

public class AWT2 {
    AWT2() {
        Frame frame = new Frame();
        Label label = new Label("Roll No:");
        Button button = new Button("Submit");
        TextField textField = new TextField();
        label.setBounds(20, 80, 80, 30);
        textField.setBounds(20, 100, 80, 30);
        button.setBounds(100, 100, 80, 30);
        frame.add(label);
        frame.add(button);
        frame.add(textField);
        frame.setSize(444, 444);
        frame.setTitle("AWT 2");
        frame.setVisible(true);
        frame.setLayout(null);
    }

    public static void main(String[] args) {
        AWT2 obj = new AWT2();
    }
}
