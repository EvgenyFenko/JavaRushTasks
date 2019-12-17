package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {

    }

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static class Thread1 extends Thread {
        public void run() {
            while (true) {

            }

        }
    }

    public static class Thread2 extends Thread {
        public void run() {
            try {
                throw new  InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        public void run() {

            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);

                }
//                Thread.sleep(500);

            } catch (Exception e) {

            }
        }
    }

    public static class Thread4 extends Thread implements Message {

        private boolean die;

        public Thread4 () {
//            super(name);
            this.die = false;
        }

        @Override
        public void run() {
            while (die == false) {
            }
        }

        @Override
        public void showWarning() {
            die = true;
        }
    }

    public static class Thread5 extends Thread {
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String string;
            int result = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();
            try {
                while (!(string = reader.readLine()).equals("N")) {
                    arrayList.add(Integer.parseInt(string));
                }
            } catch (Exception e) {

            }
            for (Integer elem : arrayList) {
                result += elem;
            }
            System.out.println(result);
        }
    }
}