package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Character> listWord = new ArrayList<>();
        listWord.add('п');
        listWord.add('р');
        listWord.add('и');
        listWord.add('в');
        listWord.add('е');
        listWord.add('т');
        listWord.add(' ');
        listWord.add('м');
        listWord.add('и');
        listWord.add('р');
        Cipher cipher = new Cipher(1);
        for (int i = 0; i < listWord.size(); i++) {
            System.out.print(listWord.get(i));
        }
        System.out.println();
        cipher.cipher(listWord);
        cipher.cipher(listWord);
        for (int i = 0; i < listWord.size(); i++) {
            System.out.print(listWord.get(i));
        }
    }
}
