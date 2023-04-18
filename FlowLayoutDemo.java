/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flowlayoutdemo;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
public static void main(String[] args) {
JFrame frame = new JFrame("FlowLayout Demo");
frame.setLayout(new FlowLayout());
for (int i = 1; i <= 5; i++) {
JButton button = new JButton("Button " + i);
frame.add(button);
}
frame.setSize(400, 300);
frame.setVisible(true);
}
}
/**
 *
 * @author Administrator
 */

