package com.javarush.task.task12.task1230;

/* 
Попадание в десятку
*/

import org.w3c.dom.css.CSSStyleDeclaration;

public class Solution {

    public static void main(String[] args) {
//        public static int transformValue(int i) { return i * 2;}

        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }
    public static int transformValue(Integer i) { return (i * 2);}
}
