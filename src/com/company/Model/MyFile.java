package com.company.Model;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class MyFile {

    public List<Character> read(File directory, List<Character> list) {
        String charset = "UTF-8";
        try (BufferedReader reader = new BufferedReader(new FileReader(directory, StandardCharsets.UTF_8))) {
            while (reader.ready()) {
                int value = reader.read();
                list.add((char)value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void write(File directory, List<Character> list) {
        try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(directory))) {
            for (Character character : list) {
                buffWriter.write(character);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clear(File directory) {
        try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(directory));
             BufferedReader reader = new BufferedReader(new FileReader(directory))) {
            while (reader.ready()) {
                buffWriter.write("");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lowerTexts(List<Character> list) {
        for (int i = 0; i < list.size(); i++) {
            char value = Character.toLowerCase(list.get(i));
            list.set(i, value);
        }
    }

    public void upperTexts(List<Character> list) {
        for (int i = 0; i < list.size(); i++) {
            char value = Character.toUpperCase(list.get(i));
            list.set(i, value);
        }
    }
}
