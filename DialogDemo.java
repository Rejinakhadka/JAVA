/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dialogdemo;

import javax.swing.*;
public class DialogDemo {
public static void main(String[] args) 
{ JFrame frame =
new JFrame("Dialog Demo");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton button = new JButton("Open Dialog");
button.addActionListener(e -> {
JDialog dialog = new JDialog(frame, "Dialog", true);
dialog.add(new JLabel("Hello from the dialog!"));
dialog.setSize(200, 100);
dialog.setVisible(true);
});
frame.add(button);
frame.setSize(300, 200);
frame.setVisible(true);

}
}