/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.borderlayoutdemo;

import javax.swing.*;
import java.awt.*;
public class BorderLayoutDemo {
public static void main(String[] args) {
JFrame frame = new JFrame("BorderLayout Demo");
frame.setLayout(new BorderLayout());
JButton button1 = new JButton("North");
frame.add(button1, BorderLayout.NORTH);
JButton button2 = new JButton("South");
frame.add(button2, BorderLayout.SOUTH);
JButton button3 = new JButton("East");
frame.add(button3, BorderLayout.EAST);
JButton button4 = new JButton("West");
frame.add(button4, BorderLayout.WEST);
JButton button5 = new JButton("Center");
frame.add(button5, BorderLayout.CENTER);
frame.setSize(400, 300);
frame.setVisible(true);
}
}
