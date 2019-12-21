package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

// /home/evgeny/file1.txt

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String [] namesOfFiles = new String[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < namesOfFiles.length; i++) {
        namesOfFiles[i] = reader.readLine();
        }

        FileInputStream inputStream = new FileInputStream(namesOfFiles[0]);
        byte[] buffer = new byte[inputStream.available()];

        inputStream.read(buffer, 0, buffer.length);

        int count1 = (int) Math.ceil((buffer.length)/2.0);
        int count2 = buffer.length - count1;

        FileOutputStream outputStream1 = new FileOutputStream(namesOfFiles[1]);
        FileOutputStream outputStream2 = new FileOutputStream(namesOfFiles[2]);
        outputStream1.write(buffer, 0, count1);
        outputStream2.write(buffer, count1, buffer.length-count1);

        reader.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
