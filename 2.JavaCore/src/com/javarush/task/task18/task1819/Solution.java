package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(file1);
        byte [] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer1);
        fileInputStream1.close();

        FileInputStream fileInputStream2 = new FileInputStream(file2);
        byte [] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer2);

        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        fileOutputStream.write(buffer2);
        fileOutputStream.write(buffer1);

        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();
    }
}
