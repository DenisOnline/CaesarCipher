package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Character> listWord = Arrays.asList('к','р','и','п','т','о','г','р','а','ф','и','я',' ', 'э', 'т', 'о', ' ', 'а','л','г','о','р','и','т','м','ы', ' ', 'ш','и','ф','р','о','в','а','н','и','я',' ', 'д','а','н','н','ы','х');

        Cipher cipher = new Cipher();
        for (int i = 0; i < listWord.size(); i++) {
            System.out.print(listWord.get(i));
        }
        cipher.encrypt(listWord, 3);
        System.out.println("\nencrypt");
        for (int i = 0; i < listWord.size(); i++) {
            System.out.print(listWord.get(i));
        }
        System.out.println("\ndecrypt");
        cipher.decrypt(listWord, 3);
        for (int i = 0; i < listWord.size(); i++) {
            System.out.print(listWord.get(i));
        }
    }
}
