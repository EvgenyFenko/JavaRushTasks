package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

public class Restaurant {

    public static void main(String[] args) {
//        System.out.println(Dish.allDishesToString());
        Tablet tablet = new Tablet(1);
        tablet.createOrder();
        tablet.createOrder();
//        tablet.createOrder();
//        tablet.createOrder();

        Cook cook = new Cook("Amigo");
        Waiter waiter = new Waiter();
        cook.update(tablet, tablet.createOrder());



    }
}
