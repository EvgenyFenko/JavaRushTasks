package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String file = in.nextLine();
        FileInputStream fileInputStream = new FileInputStream(file);

        Set<Integer> list = new TreeSet<>();
        while (fileInputStream.available() > 0) {
            int n = fileInputStream.read();
            list.add(n);
        }
        fileInputStream.close();

        String result = "";
        for (Integer elem : list) {
            result = result + elem + " ";
        }
        System.out.println(result);
    }
}
