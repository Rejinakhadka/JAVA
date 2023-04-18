/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actionlistenerdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ActionListenerDemo implements ActionListener
{ JFrame frame;
JButton button;
public ActionListenerDemo() {
frame = new JFrame("ActionListener Demo");
button = new JButton("Click me!");
button.addActionListener(this);
frame.add(button, BorderLayout.CENTER);
frame.pack();
frame.setVisible(true);
}
public void actionPerformed(ActionEvent event) {
JOptionPane.showMessageDialog(frame, "Button clicked!");
}
public static void main(String[] args) {
new ActionListenerDemo();
}
}