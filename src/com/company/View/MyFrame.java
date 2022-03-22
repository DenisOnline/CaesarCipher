package com.company.View;

import javax.swing.*;

public class MyFrame extends JFrame{
    MyPanel panel;
    public MyFrame(MyPanel panel) {
        super("Cipher");
        this.panel = panel;
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(410, 140);
        setResizable(false);
        setVisible(true);
    }
}