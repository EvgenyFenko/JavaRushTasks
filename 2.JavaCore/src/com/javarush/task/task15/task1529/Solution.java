package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
//        result = reset();

        reset();


    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        int n = 0;
        try {
            s = reader.readLine();
        } catch (Exception e) {

        }

        if (s.equals("helicopter")){
            result = new Helicopter();
        } else if (s.equals("plane")) {
            try {
                n = Integer.parseInt(reader.readLine());
            } catch (Exception e) {

            }
            result = new Plane(n);
        }
        try {
            reader.close();
        } catch (Exception e) {

        }

    }
}
