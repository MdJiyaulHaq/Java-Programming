package com.Advance.AWT;

import java.applet.Applet;
import java.awt.*;

public class FontChange extends Applet {

    Label label;

    public void init() {
        label = new Label("Pokhara University");
        add(label);

        label.setBackground(Color.blue);
        Font font = new Font("Times New Roman", Font.BOLD, 20);
        label.setFont(font);

    }
}
/*
<applet code="Exercise1"  height="333"  width="333" >
</applet>
 */