package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(consoleReader.readLine());
        int min = fileInputStream.read();
        int n;
        while (fileInputStream.available() > 0) {
            if ((n = fileInputStream.read()) < min) {
                min = n;
            }
        }
        fileInputStream.close();
        System.out.println(min);
    }
}
