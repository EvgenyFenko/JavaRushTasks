package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = consoleReader.readLine();
            try {
                BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                consoleReader.close();
                break;
            }
        }
    }
}
