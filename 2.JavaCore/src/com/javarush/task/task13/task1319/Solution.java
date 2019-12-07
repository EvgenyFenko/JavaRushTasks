package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in); // поток чтения с консоли
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  // соединяем InputStreamReader с BufferedReader

            String filename = bufferedReader.readLine();

            File file = new File(filename);
            FileWriter fileWriter = new FileWriter(file); // поток, который подключается к текстовому файлу
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // соединяем FileWriter с BufferedWriter

            String line;
            while(true) {
                line = bufferedReader.readLine();
                bufferedWriter.write("\n" + line);
                if (line.equals("exit")) break;
            }

            bufferedReader.close(); // закрываем поток
            bufferedWriter.close(); // закрываем поток
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
