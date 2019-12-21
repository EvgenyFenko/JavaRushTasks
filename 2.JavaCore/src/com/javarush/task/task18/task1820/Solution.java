package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String file1 = reader.readLine();
//        String file2 = reader.readLine();
//        reader.close();

        String file1 = "/home/evgeny/file1.txt";

        FileInputStream fileInputStream = new FileInputStream(file1);
        byte [] buffer = new byte [fileInputStream.available()];
        fileInputStream.read(buffer);
        String numbers = new String(buffer);

//        ArrayList<String> tmp = new ArrayList<>();
        String [] tmp;
        tmp = numbers.split(" ");
        for (String elem : tmp) {
            Double dbl = (Double) elem;
        }

        System.out.println(numbers);




    }
}
