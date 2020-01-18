package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;

import java.io.IOException;

public class Restaurant {

    public static void main(String[] args) throws IOException {
//        System.out.println(Dish.allDishesToString());
        Tablet tablet = new Tablet(1);

        Cook cook = new Cook("Amigo");
        tablet.addObserver(cook);
        tablet.createOrder();


    }
}
