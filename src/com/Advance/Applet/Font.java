package com.Advance.Applet;

import java.applet.Applet;
import java.awt.*;

public class Font extends Applet {
    public void init() {
        Font f1 = new Font("Times New Roman", Font.BOLD, 20);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.setFont(f1);
        g.drawString("Md Jiyaul", 50, 50);

    }
}

/*
 <applet code = "fon.class" height = 500 width =500>
   </applet>
*/