package com.company.Model;

import java.io.*;
import java.util.List;

public class File {

    public List<Character> read(List<Character> list, String way) {
        try (BufferedReader reader = new BufferedReader(new FileReader(way))) {
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

    public void write(List<Character> list, String way) {
        try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(way))) {
            for (Character character : list) {
                buffWriter.write(character);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
