package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println(lines);
    }

    static {
        try {
            FileReader file = new FileReader(new File(Statics.FILE_NAME));
            BufferedReader reader = new BufferedReader(file);
            while (true) {
                String s = reader.readLine();
                if (s != null) {
                    lines.add(s);
                } else break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
