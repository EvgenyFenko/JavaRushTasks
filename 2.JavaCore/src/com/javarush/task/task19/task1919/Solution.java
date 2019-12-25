package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
//        String fileName = args[0];
        String fileName = "/home/evgeny/file1.txt";

        TreeMap<String, Double> treeMap = new TreeMap<>();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while (bufferedReader.ready()) {
            String [] array = bufferedReader.readLine().split(" ");
            if (treeMap.get(array[0]) == null) {
                treeMap.put(array[0], Double.parseDouble(array[1]));
            } else {
                Double newValue = treeMap.get(array[0]) + Double.parseDouble(array[1]);
                treeMap.put(array[0], newValue);
            }
        }

        bufferedReader.close();

        for (Map.Entry map : treeMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
