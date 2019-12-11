package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

import javax.xml.namespace.QName;

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();
        System.out.println(cat.name = "adf");
    }

    public static void main(String[] args) {

    }

    public static class Cat {
        public String name;

    }
}
