package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;

public class Restaurant {

    public static void main(String[] args) {
//        System.out.println(Dish.allDishesToString());
        Tablet tablet = new Tablet(1);
<<<<<<< HEAD
        tablet.createOrder();
        tablet.createOrder();
//        tablet.createOrder();
//        tablet.createOrder();

        Cook cook = new Cook("Amigo");
        Waiter waiter = new Waiter();
        cook.update(tablet, tablet.createOrder());

=======

        Cook cook = new Cook("Amigo");
        tablet.addObserver(cook);
        tablet.createOrder();
>>>>>>> tmp


    }
}
