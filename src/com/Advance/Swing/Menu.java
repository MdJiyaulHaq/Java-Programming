package com.Advance.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    static JFrame frame;
    static JMenuBar menuBar;
    static JMenu menu;
    static JMenuItem menuItem1, menuItem2, menuItem3;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;

    Menu() {
        frame = new JFrame("Addition and Subtraction");
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        menu = new JMenu("File");
        menuBar.add(menu);
        menuItem1 = new JMenuItem("Add");
        menu.add(menuItem1);
        menuItem2 = new JMenuItem("Subtract");
        menu.add(menuItem2);
        menuItem3 = new JMenuItem("Close");
        menu.add(menuItem3);

        l1 = new JLabel("Args 1:");
        l1.setBounds(33, 33, 99, 22);
        t1 = new JTextField();
        t1.setBounds(99, 33, 99, 22);

        l2 = new JLabel("Args 2:");
        l2.setBounds(33, 66, 99, 22);
        t2 = new JTextField();
        t2.setBounds(99, 66, 99, 22);

        l3 = new JLabel("Result:");
        l3.setBounds(33, 99, 99, 22);
        t3 = new JTextField();
        t3.setBounds(99, 99, 99, 22);

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);

        frame.setLayout(null);
        frame.setSize(444, 444);
        frame.setVisible(true);
        frame.setTitle("Addition and Subtraction");
    }

    public static void main(String[] args) {
        Menu m = new Menu();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == menuItem1) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(" " + (n1 + n2));
        } else if (ae.getSource() == menuItem2) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(" " + (n1 - n2));
        } else if (ae.getSource() == menuItem3) {
            frame.setVisible(false);
            frame.dispose();
        }
    }
}
