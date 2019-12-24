package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Нити и байты
*/

// /home/evgeny/file1.txt

// максимум в хаш мапе?

public class Solution {



    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

//        read fileNames while do not input "exit"
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (true) {
            fileName = reader.readLine();
            if (fileName.equals("exit")) {
                reader.close();
                break;
            } else {
                ReadThread readThread = new ReadThread(fileName);
                readThread.start();
                readThread.run();
            }
        }
    }

    public static class ReadThread extends Thread {
        public String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            super();
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            try {
                BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
                HashMap<Integer, Integer> hashMapForFile = new HashMap<Integer, Integer>();
                int key;
                int value = 1;
                while ((key = fileReader.read()) != -1) {
                    if (hashMapForFile.get(key) != null) {
                        value = hashMapForFile.get(key) + 1;
                    }
                    hashMapForFile.put(key, value);
                    value = 1;
                }
                fileReader.close();

// find max value
                Collection<Integer> collection;
                collection = hashMapForFile.values();
                int maxValue = Collections.max(collection);
                for (Map.Entry<Integer, Integer> entry : hashMapForFile.entrySet()) {
                    if (entry.getValue().equals(maxValue)) {
                        resultMap.put(fileName, entry.getKey());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
