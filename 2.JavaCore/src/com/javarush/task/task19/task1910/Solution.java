package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

// /home/evgeny/file1.txt

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = conReader.readLine();
        String fileName2 = conReader.readLine();
        conReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        while (fileReader.ready()) {
            String s1 = fileReader.readLine();
            String s2 = s1.replaceAll("\\p{Punct}", "");
            fileWriter.write(s2);
        }
        fileWriter.close();
        fileReader.close();
    }
}
