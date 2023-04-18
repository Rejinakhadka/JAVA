/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.keylistenerdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyListenerDemo implements KeyListener
{ JFrame frame;
JLabel label;
public KeyListenerDemo() {
frame = new JFrame("KeyListener Demo");
label = new JLabel("Type something...");
frame.add(label, BorderLayout.CENTER);
frame.addKeyListener(this);
frame.pack();
frame.setVisible(true);
}
public void keyTyped(KeyEvent event) {
label.setText("Typed: " + event.getKeyChar());
}
public void keyPressed(KeyEvent event) {
label.setText("Pressed: " + event.getKeyChar());
}
public void keyReleased(KeyEvent event) {
label.setText("Released: " + event.getKeyChar());
}
public static void main(String[] args) {
new KeyListenerDemo();
}
}
