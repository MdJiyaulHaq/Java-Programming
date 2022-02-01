package com.Advance.Swing;

import javax.swing.*;
import java.awt.*;

public class Graphics1 extends Canvas {
    public static void main(String[] args) {
        Graphics1 graphics1 = new Graphics1();
        JFrame frame = new JFrame("Graphics in Swing");

        frame.add(graphics1);

        frame.setSize(555, 555);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("Allah is Great", 33, 33);
        setBackground(Color.cyan);
        g.drawRect(222, 33, 33, 33);
        g.fillRect(44, 44, 44, 44);
        g.drawOval(222, 99, 33, 66);
        g.drawArc(111, 222, 80, 90, 60, 90);
        g.fillArc(222, 222, 80, 90, 60, 90);

    }
}
