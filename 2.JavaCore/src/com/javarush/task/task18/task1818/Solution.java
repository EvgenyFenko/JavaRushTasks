package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(file2);
        byte[] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer1);

        FileInputStream fileInputStream2 = new FileInputStream(file3);
        byte[] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer2);

        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        fileOutputStream.write(buffer1, 0, buffer1.length);
        fileOutputStream.write(buffer2);

        fileOutputStream.close();
        fileInputStream1.close();
        fileInputStream2.close();
    }
}
