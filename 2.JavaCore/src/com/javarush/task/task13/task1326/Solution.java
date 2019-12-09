package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader readerFromFile = new BufferedReader(new FileReader(fileName));


        String line;
        Integer n;
        List<Integer> lines = new ArrayList<>();
        while ((line = (readerFromFile.readLine())) != null){
            n = Integer.parseInt(line);
            lines.add(n);
        }
        List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            if ((lines.get(i) % 2) == 0) {
                evenNumbers.add(lines.get(i));
            }
        }

        for (int i = evenNumbers.size()-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (evenNumbers.get(j + 1) < evenNumbers.get(j)) {
                    int tmp = evenNumbers.get(j);
                    evenNumbers.set(j, evenNumbers.get(j+1));
                    evenNumbers.set(j+1, tmp);
                }
            }
        }

        for (int i = 0; i < evenNumbers.size(); i++) {
            System.out.println(evenNumbers.get(i));
        }
    }
}
