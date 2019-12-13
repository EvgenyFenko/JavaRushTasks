package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/*
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string;
        try {
            string = reader.readLine();

            String[] parts = string.split("\\?");

            String secondPartOfString = parts[1];

            ArrayList<String> params = new ArrayList<>();
            ArrayList<String> values = new ArrayList<>();

            HashMap<String, String > hashMap = new HashMap<>();
            Map<Integer, String []> map = new HashMap<>();

            String[] paramsAndValues = secondPartOfString.split("&");

            for (int i = 0; i < paramsAndValues.length; i++ ) {
                String [] elem = paramsAndValues[i].split("=");
                map.put(i, elem);

                if ((elem.length) == 1) {
                    hashMap.put(elem[0], null);
                } else if (elem.length == 2) {
                    hashMap.put(elem[0], elem[1]);
                }
            }

//            map.forEach((k, v) -> System.out.println(v));

            for (Map.Entry<Integer, String[]> pair : map.entrySet()) {
                String elem [] = pair.getValue();
                System.out.print(elem[0] + " ");
            }
            System.out.println();

            for (Map.Entry<Integer, String[]> pair : map.entrySet()) {
                String elem [] = pair.getValue();
                Double d = null;
                if (elem[0].equals("obj")) {
                    try {
                        d = Double.parseDouble(elem[1]);
                        alert(d);
                    } catch (Exception e) {
                        alert(elem[1]);
                    }
                }
//                System.out.println(elem[0]);
            }


        } catch (Exception e) {

        }

    }











    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}