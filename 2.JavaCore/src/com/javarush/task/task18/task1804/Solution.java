package com.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String file = in.nextLine();
        int min = 1;
        FileInputStream fileInputStream = new FileInputStream(file);
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while (fileInputStream.available() > 0) {
            int n = fileInputStream.read();
            if (hashMap.containsKey(n)) {
                int value = hashMap.get(n) + 1;
                hashMap.put(n, value);
            } else {
                hashMap.put(n, 1);
            }
        }
        fileInputStream.close();

        Collection <Integer> arrayList = new ArrayList<>();
        arrayList = hashMap.values();
        min = Collections.min(arrayList);

        String result = "";
        for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == min) {
                result = result + entry.getKey() + " ";
            }
        }
        System.out.print(result);
    }
}
