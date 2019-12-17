package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        String file1 = "";
        String file2 = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            file1 = reader.readLine();
            file2 = reader.readLine();
        } catch (Exception e) {

        }

        try {
            BufferedReader filereader = new BufferedReader(new FileReader(file1));
            String string;
            while ((string = filereader.readLine()) != null){
                allLines.add(string);
            }
        } catch (Exception e) {

        }

        try {
            BufferedReader filereader = new BufferedReader(new FileReader(file2));
            String string;
            while ((string = filereader.readLine()) != null){
                forRemoveLines.add(string);
            }
        } catch (Exception e) {

        }

        Solution solution = new Solution();
        solution.joinData();

        for (int i = 0; i < allLines.size(); i++) {
            System.out.println(allLines.get(i));
        }
//
//        for (int i = 0; i < forRemoveLines.size(); i++) {
//            System.out.println(forRemoveLines.get(i));
//        }

    }

    public void joinData() throws CorruptedDataException {
        for (String remove : forRemoveLines)
            if (!allLines.remove(remove)) {
                allLines.clear();
                throw new CorruptedDataException();
            }
    }
}
