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
        Integer line;
        List<Integer> lines = new ArrayList<>();
        line = Integer.parseInt(readerFromFile.readLine());
        while (readerFromFile.readLine() != null){
            line = Integer.parseInt(readerFromFile.readLine());
            System.out.println(line);
            lines.add(line);
        }
        List<Integer> negativeNumbers = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i) % 2 == 0) {
                negativeNumbers.add(lines.get(i));
            }
        }

        for (int i = lines.size(); i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (lines.get(j + 1) < lines.get(j)) {
                    int tmp = lines.get(j);
                    lines.set(j, lines.get(j+1));
                    lines.set(j+1, tmp);
                }
            }
        }

        for (int i = 0; i < lines.size(); i++) {
            System.out.println(lines.get(i));
            }
        }


//        negativeNumbers = this.sortFunction(negativeNumbers);


//    }

////    delete this function after success solution of task
//    public List<Integer> sortFunction(List<Integer> list) {
//        for (int i = list.size(); i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (list.get(j + 1) < list.get(j)) {
//                    int tmp = list.get(j);
//                    list.set(j, list.get(j+1));
//                    list.set(j+1, tmp);
//                }
//            }
//        }
//        return list;
//    }
}
