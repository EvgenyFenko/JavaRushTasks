package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        FileReader reader = new FileReader(file);
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        char key;
        int value;
        while (reader.ready()) {
            key = (char) reader.read();
            if (treeMap.get(key) != null) {
                value = treeMap.get(key) + 1;
            } else value = 1;
            treeMap.put(key, value);
        }
        reader.close();
        for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
            System.out.println((entry.getKey()) + " " + entry.getValue());
        }

    }
}
