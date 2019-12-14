package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;
    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут

        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
//            System.out.println(numSeconds);

            while (true) {

                if (numSeconds >= 1) {
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.print("Прервано!");
                        break;
                    }

                } else {
                    System.out.print("Марш!");
                    break;
                }


            }
            //add your code here - добавь код тут
        }
    }
}
