package com.javarush.task.task18.task1803;

/*
Самые частые байты
*/

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String file = in.nextLine();
        int max = 0;
        FileInputStream fileInputStream = new FileInputStream(file);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while (fileInputStream.available() > 0) {
            int n = fileInputStream.read();
            if (hashMap.containsKey(n)) {
                int value = hashMap.get(n) + 1;
                max = value;
                hashMap.put(n, value);
            } else {
                hashMap.put(n, 1);
            }
        }
        fileInputStream.close();

        String result = "";
        for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == max) {
                result = result + entry.getKey() + " ";
            }
        }
        System.out.print(result);
    }
}
