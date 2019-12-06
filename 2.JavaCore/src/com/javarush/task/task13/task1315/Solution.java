package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public class Dog implements Movable, Eat {
        public void move(){

        }

        public void eat() {

        }
    }

    public class Cat implements Movable, Edible, Eat {
        public void beEaten() {

        }

        public void move(){

        }

        public void eat() {

        }
    }

    public class Mouse implements Edible, Movable {
        public void beEaten() {

        }

        public void move(){

        }
    }
}