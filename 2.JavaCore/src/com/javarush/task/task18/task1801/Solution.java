package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;/*
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInputStream = new FileInputStream(consoleReader.readLine());
        int max = fileInputStream.read();
        int n;
        while (fileInputStream.available() > 0) {
            if ((n = fileInputStream.read()) > max) {
                max = n;
            }
        }
        fileInputStream.close();
        System.out.println(max);
    }
}
