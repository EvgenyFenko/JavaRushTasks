package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int n;
        int m;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        n = Integer.parseInt(reader.readLine());
        m = Integer.parseInt(reader.readLine());

        if(n <= 0 || m <= 0) {
            throw new Exception();
        }

        while (m !=0) {
            int tmp = n%m;
            n = m;
            m = tmp;
        }
        System.out.println(n);;
    }
}
