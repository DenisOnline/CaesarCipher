package com.company.Model;

import java.util.*;

public class Cipher {
    public static final List<Character> ALPHABET = Arrays.asList('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я', 'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', '.', ',', '-', '=', '+', '\'', '\"', ':', ';', '!', '?', ' ', '@', '#', '$', '%', '^', '&', '*', '0', '1', '2', '3', '4', '5', '6', '8', '9', '(', ')', '{', '}', '[', ']');

    public void encrypt(List<Character> list, int value) {
        int key = value % ALPHABET.size();
        for (int i = 0; i < list.size(); i++) {
            if (!ALPHABET.contains(list.get(i))) continue;
            int index = ALPHABET.indexOf(list.get(i));
            list.set(i, ALPHABET.get((index + key) % ALPHABET.size()));
        }
    }

    public void decrypt(List<Character> list, int value) {
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
    }

    public void bruteForce(List<Character> arr) {
        List<Character> curentArr = new ArrayList<>(arr);
        Map<Character, Integer> map;
        List<Map.Entry<Character, Integer>> list;
        for (int i = 1; i < ALPHABET.size() - 1; i++) {
            map = new LinkedHashMap<>();
            for (Character character : ALPHABET) {
                map.put(character, 0);
            }

            for (Character character : curentArr) {
                character = Character.toLowerCase(character);
                if (map.containsKey(character)) {
                    Integer j = map.get(character);
                    map.put(character, ++j);
                }
            }

            list = new ArrayList<>(map.entrySet());
            list.sort(Comparator.comparingInt(Map.Entry::getValue));

            List<Character> result = new ArrayList<>();
            for (Map.Entry<Character, Integer> entry : list) {
                result.add(entry.getKey());
            }

            if (result.get(result.size() - 1).equals(' ')) {
                decrypt(arr, i - 1);
                break;
            } else {
                decrypt(curentArr, 1);
            }
        }
    }
}