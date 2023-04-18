/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1;

import javax.swing.*;
public class Project1 {
public static void main(String[] args) {
JFrame frame = new JFrame("No Layout Demo");
frame.setLayout(null);
JLabel label1 = new JLabel("Label 1");
label1.setBounds(50, 50, 100, 30);
frame.add(label1);
JLabel label2 = new JLabel("Label 2");
label2.setBounds(200, 100, 100, 30);
frame.add(label2);
frame.setSize(400, 300);
frame.setVisible(true);
}
}


