package com.Advance.Swing;

import javax.swing.*;

public class DialogAddition extends JFrame {
    int num1, num2, result;

    DialogAddition() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter num 1:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter num 2:"));
        result = num1 * num2;
        JOptionPane.showMessageDialog(null, "The sum is:" + result);
    }

    public static void main(String[] args) {
        DialogAddition dialogAddition = new DialogAddition();
    }
}

