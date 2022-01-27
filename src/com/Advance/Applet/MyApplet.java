package com.Advance.Applet;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("welcome to applet", 150, 150);
    }
}
/*
<applet code="myApplet.class"  height="200"   width="200"> </applet>
 */