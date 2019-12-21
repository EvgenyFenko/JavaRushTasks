package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String nameOfFiles = reader.readLine();
            FileInputStream inputStream = new FileInputStream(nameOfFiles);
            byte[] buffer = new byte[inputStream.available()];
            if (buffer.length < 1000) {
                inputStream.close();
                throw new  DownloadException();
//                break;
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
