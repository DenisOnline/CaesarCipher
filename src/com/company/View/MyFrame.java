package com.company.View;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyPanel panel;
    public MyFrame(MyPanel panel) {
        this.panel = panel;
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(420, 420);
        setVisible(true);
    }
}