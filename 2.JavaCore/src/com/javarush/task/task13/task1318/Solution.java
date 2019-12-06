package com.javarush.task.task13.task1318;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        int i;
        while((i=fileInputStream.read())!= -1){
            System.out.print((char)i);
        }
        bufferedReader.close();
        fileInputStream.close();
    }
}