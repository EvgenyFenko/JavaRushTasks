package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
//        boolean flag = false;
        String filename;
        String string = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        filename = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(filename);


        while (true) {
            string = reader.readLine() ;

            fileOutputStream.write(("\n" + string).getBytes());
            if (string.equals("exit")) break;

        }

        reader.close();
        fileOutputStream.close();
    }
}