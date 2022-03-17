package com.company.View;

import com.company.Controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    Controller controller;
    public MyPanel() {
        JButton encryptingTextWithKey = new JButton("Зашифровать по ключу");
        JButton decryptingTextWithKey = new JButton("Расшифровать по ключу");

        encryptingTextWithKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.encrypt();
            }
        });

        decryptingTextWithKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.decrypt();
            }
        });

        add(encryptingTextWithKey);
        add(decryptingTextWithKey);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}