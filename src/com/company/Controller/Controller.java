package com.company.Controller;

import com.company.Model.Cipher;
import com.company.Model.MyFile;
import com.company.View.MyFrame;
import com.company.View.MyPanel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    MyFrame frame;
    MyPanel panel;
    Cipher cipher;
    MyFile file;
    JFileChooser jFileChooser;
    List<Character> listWord;

    public Controller() {
        panel = new MyPanel();
        panel.setController(this);
        frame = new MyFrame(panel);
        cipher = new Cipher();
        file = new MyFile();
        listWord = new ArrayList<>();
        jFileChooser = new JFileChooser();
    }

    public void encrypt(int key) {
        jFileChooser.showOpenDialog(panel);
        file.read(jFileChooser.getSelectedFile(), listWord);
        file.clear(jFileChooser.getSelectedFile());
        cipher.encrypt(listWord, key);
        file.write(jFileChooser.getSelectedFile(), listWord);
        listWord.clear();
    }

    public void decrypt(int key) {
        jFileChooser.showOpenDialog(panel);
        file.read(jFileChooser.getSelectedFile(), listWord);
        file.clear(jFileChooser.getSelectedFile());
        cipher.decrypt(listWord, key);
        file.write(jFileChooser.getSelectedFile(), listWord);
        listWord.clear();
    }

    public void bruteForce() {
        jFileChooser.showOpenDialog(panel);
        file.read(jFileChooser.getSelectedFile(), listWord);
        file.clear(jFileChooser.getSelectedFile());
        cipher.bruteForce(listWord);
        file.write(jFileChooser.getSelectedFile(), listWord);
        listWord.clear();
    }
}