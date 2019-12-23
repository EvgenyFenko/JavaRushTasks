package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        int id = 21;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

//        String file = "/home/evgeny/file1.txt";

        Scanner scanner = new Scanner(new File(file));
        ArrayList<String> arrayList = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String idInLine = (line.split(" "))[0];
            if (Integer.parseInt(idInLine) == id) {
                System.out.println(line.toString());
            }
            scanner.close();
//            arrayList.add(line[0]);
//            arrayList.add(scanner.nextLine());
//            arrayList.add(line.split(" "));
        }
//        System.out.println(arrayList.toString());
    }
}
