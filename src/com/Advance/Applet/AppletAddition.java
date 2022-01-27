package com.Advance.Applet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletAddition extends MyApplet implements ActionListener {
    Label l1 = new Label("Number 1:");
    Label l2 = new Label("Number 2:");
    Label l3 = new Label("Result:");
    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);
    TextField t3 = new TextField(10);
    Button b = new Button("Sum");

    public void init() {
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(" " + (n1 + n2));
        }
    }
}

/*
<applet code="AppletAddition" height="300" width="300">
</applet>
 */