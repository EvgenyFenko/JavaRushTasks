package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private String thirdName;
        private int weight1;
        private int weight2;
        private int weight3;

        public Human(int weight1)
        {
            this.weight1 = weight1;
        }

        public Human(int weight1, int weight2)
        {
            this.weight1 = weight1;
            this.weight2 = weight2;
        }

        public Human(int weight1, int weight2, int weight3)
        {
            this.weight1 = weight1;
            this.weight2 = weight2;
            this.weight3 = weight3;
        }

        public Human(int weight1, int weight2, int weight3, String name)
        {
            this.weight1 = weight1;
            this.weight2 = weight2;
            this.weight3 = weight3;
            this.name = name;
        }

        public Human(int weight1, int weight2, int weight3, String name, String surname)
        {
            this.weight1 = weight1;
            this.weight2 = weight2;
            this.weight3 = weight3;
            this.name = name;
            this.surname = surname;
        }

        public Human(int weight1, int weight2, int weight3, String name, String surname, String thirdName)
        {
            this.weight1 = weight1;
            this.weight2 = weight2;
            this.weight3 = weight3;
            this.name = name;
            this.surname = surname;
            this.thirdName = thirdName;
        }

        public Human(int weight2, int weight3, String name, String surname, String thirdName)
        {
            this.weight2 = weight2;
            this.weight3 = weight3;
            this.name = name;
            this.surname = surname;
            this.thirdName = thirdName;
        }

        public Human(int weight3, String name, String surname, String thirdName)
        {
            this.weight3 = weight3;
            this.name = name;
            this.surname = surname;
            this.thirdName = thirdName;
        }

        public Human(String name, String surname, String thirdName)
        {
            this.name = name;
            this.surname = surname;
            this.thirdName = thirdName;
        }

        public Human(String surname, String thirdName)
        {
            this.surname = surname;
            this.thirdName = thirdName;
        }
    }
}
