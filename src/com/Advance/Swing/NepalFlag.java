package com.Advance.Swing;

import java.awt.*;

public class NepalFlag extends Frame {
    Color c = new Color(221, 12, 39);

    NepalFlag() {
        setLayout(null);
        setVisible(true);
        setSize(777, 999);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NepalFlag();
    }

    public void paint(Graphics g) {
        int[] recx = {100, 700, 700, 100};
        int[] recy = {100, 100, 700, 700};
        g.setColor(Color.green);
        g.fillPolygon(recx, recy, 4);

        int[] ux = {200, 350, 200};
        int[] uy = {150, 350, 350};
        g.setColor(Color.blue);
        g.drawPolygon(ux, uy, 3);
        g.setColor(c);
        g.fillPolygon(ux, uy, 3);

        int[] lx = {200, 400, 200};
        int[] ly = {350, 600, 600};
        g.setColor(Color.blue);
        g.drawPolygon(lx, ly, 3);
        g.setColor(c);
        g.fillPolygon(lx, ly, 3);
        //moon
        g.setColor(Color.white);
        g.drawOval(240, 275, 30, 30);
        g.setColor(c);
        g.fillOval(240, 270, 30, 30);
        //sun
        g.setColor(Color.white);
        g.fillOval(240, 480, 30, 30);
        //Nepal
        g.setColor(Color.black);
        g.drawString("NEPAL", 400, 750);
    }
}