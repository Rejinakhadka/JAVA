/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menudemo;

import javax.swing.*;
public class MenuDemo {
public static void main(String[] args) { JFrame frame =
new JFrame("Menu Demo");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// create menu bar
JMenuBar menuBar = new JMenuBar();
// create menus
JMenu fileMenu = new JMenu("File");
JMenu editMenu = new JMenu("Edit");
// create menu items
JMenuItem newItem = new JMenuItem("New");
JMenuItem openItem = new JMenuItem("Open");
JMenuItem saveItem = new JMenuItem("Save");
JMenuItem exitItem = new JMenuItem("Exit");
JMenuItem cutItem = new JMenuItem("Cut");
JMenuItem copyItem = new JMenuItem("Copy");
JMenuItem pasteItem = new JMenuItem("Paste");
// add menu items to menus
fileMenu.add(newItem);
fileMenu.add(openItem);
fileMenu.add(saveItem);
fileMenu.addSeparator();
fileMenu.add(exitItem);
editMenu.add(cutItem);
editMenu.add(copyItem);
editMenu.add(pasteItem);

    
// add menus to menu bar
menuBar.add(fileMenu);
menuBar.add(editMenu);
// set menu bar to frame
frame.setJMenuBar(menuBar);
frame.setSize(300, 200);
frame.setVisible(true);
}
}
