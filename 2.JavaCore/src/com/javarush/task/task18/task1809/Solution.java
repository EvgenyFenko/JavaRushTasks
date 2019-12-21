package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String [] namesOfFiles = new String[2];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < namesOfFiles.length; i++) {
            namesOfFiles[i] = reader.readLine();
        }

        FileInputStream inputStream = new FileInputStream(namesOfFiles[0]);
        byte[] buffer = new byte[inputStream.available()];

        inputStream.read(buffer, 0, buffer.length);

        sort(buffer);

        FileOutputStream outputStream = new FileOutputStream(namesOfFiles[1]);
        outputStream.write(buffer, 0, buffer.length);

        reader.close();
        inputStream.close();
        outputStream.close();
    }

    public static void sort(byte [] massive) {
        for (int i = 0; i < massive.length / 2; i++) {
            byte tmp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = tmp;
        }
    }
}
