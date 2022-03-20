package com.company.View;

import com.company.Controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    Controller controller;
    public MyPanel() {
        JButton encryptingTextWithKey = new JButton("Зашифровать");
        JButton decryptingTextWithKey = new JButton("Расшифровать");
        JButton hacking = new JButton("Взломать");
        JLabel textKeyForEncrypt = new JLabel("Ключ шифрования: ");
        JLabel textKeyForDencrypt = new JLabel("Ключ расшифрования: ");
        JTextField keyForEncropt = new JTextField(10);
        JTextField keyForDencropt = new JTextField(10);

        encryptingTextWithKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.encrypt(Integer.parseInt(keyForEncropt.getText()));
            }
        });

        decryptingTextWithKey.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.decrypt(Integer.parseInt(keyForDencropt.getText()));
            }
        });

        hacking.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.bruteForce();
            }
        });

        add(encryptingTextWithKey);
        add(textKeyForEncrypt);
        add(keyForEncropt);
        add(decryptingTextWithKey);
        add(textKeyForDencrypt);
        add(keyForDencropt);
        add(hacking);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}