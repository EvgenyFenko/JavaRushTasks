package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        byte[] buffer = new byte[inputStream.available()];

        if (inputStream.available() > 0) {
            inputStream.read(buffer);
        }

        int count = 0;
        for (int i = 0; i < buffer.length; i++)
        {
            if (buffer[i] == 44){
                count++;
            }
        }
        System.out.println(count);

        inputStream.close();
    }
}
