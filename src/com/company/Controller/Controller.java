package com.company.Controller;

import com.company.Model.Cipher;
import com.company.Model.File;
import com.company.View.MyFrame;
import com.company.View.MyPanel;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    MyFrame frame;
    MyPanel panel;
    Cipher cipher;
    File file;
    List<Character> listWord;
    String wayInput = "C:\\Users\\denis\\IdeaProjects\\testGit\\text.txt";
    String wayOutput = "C:\\Users\\denis\\IdeaProjects\\testGit\\answer.txt";

    public Controller() {
        panel = new MyPanel();
        panel.setController(this);
        frame = new MyFrame(panel);
        cipher = new Cipher();
        file = new File();
        listWord = new ArrayList<>();
    }

    public void encrypt() {
        file.clear(wayOutput);
        file.read(listWord, wayInput);
        cipher.encrypt(listWord, 4);
        file.write(listWord, wayOutput);
        listWord.clear();
    }

    public void decrypt() {
        file.read(listWord, wayOutput);
        cipher.decrypt(listWord, 4);
        file.clear(wayOutput);
        file.write(listWord, wayOutput);
        listWord.clear();
    }
}