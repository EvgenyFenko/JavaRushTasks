package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer, 0, buffer.length);

        int countOfBreaks = 0;
        int totalCount = 0;

        for (byte elem : buffer) {
            if (elem == 32) {
                countOfBreaks++;
            }
            totalCount++;
        }

        double result = 0.0;
        result = (countOfBreaks*1.0) / (totalCount*1.0) * 100.0;
        System.out.printf("%.2f", result);

        fileInputStream.close();
    }
}
