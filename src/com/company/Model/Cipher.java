package com.company.Model;

import java.util.Arrays;
import java.util.List;

public class Cipher {
    public static final List<Character> ALPHABET = Arrays.asList('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', ' ', '.', ',', '-', '=', '+', '\'', '\"', ':', ';', '!', '?', '@', '#', '$', '%', '^', '&', '*', '0', '1', '2', '3', '4', '5', '6', '8', '9', '(', ')', '{', '}', '[', ']');

    public List<Character> encrypt(List<Character> list, int value) {
        int key = value % ALPHABET.size();
        for (int i = 0; i < list.size(); i++) {
            if (!ALPHABET.contains(list.get(i))) continue;
            int index = ALPHABET.indexOf(list.get(i));
            list.set(i, ALPHABET.get((index + key) % ALPHABET.size()));
        }
        return list;
    }

    public List<Character> decrypt(List<Character> list, int value) {
        int key = value % ALPHABET.size();
        for (int i = 0; i < list.size(); i++) {
            if (!ALPHABET.contains(list.get(i))) continue;
            int index = ALPHABET.indexOf(list.get(i));
            char charInList = ALPHABET.get(Math.abs(index - key));
            if (index - key < 0) {
                charInList = ALPHABET.get(ALPHABET.size() - Math.abs(index - key));
            }
            list.set(i, charInList);
        }
        return list;
    }

//    public void decrypt(List<Character> list) {
//        LinkedHashMap<Integer, List<Character>> allVariats = new LinkedHashMap<>();
//        List<Character> encList;
//        for (int i = 1; i < ALPHABET.size(); i++) {
//            decrypt(list, i);
//            allVariats.put(i, decrypt(list, i));
//            if ()
//        }
//    }
}