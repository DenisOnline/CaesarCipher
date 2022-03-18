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

    public void encrypt() {
        jFileChooser.showOpenDialog(panel);
        file.read(jFileChooser.getSelectedFile(), listWord);
        file.clear(jFileChooser.getSelectedFile());
        file.lowerTexts(listWord);
        cipher.encrypt(listWord, 4);
        file.upperTexts(listWord);
        file.write(jFileChooser.getSelectedFile(), listWord);
        listWord.clear();
    }

    public void decrypt() {
        jFileChooser.showOpenDialog(panel);
        file.read(jFileChooser.getSelectedFile(), listWord);
        file.clear(jFileChooser.getSelectedFile());
        file.lowerTexts(listWord);
        cipher.decrypt(listWord, 4);
        file.upperTexts(listWord);
        file.write(jFileChooser.getSelectedFile(), listWord);
        listWord.clear();
    }
}