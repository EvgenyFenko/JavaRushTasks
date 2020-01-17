package com.javarush.task.task27.task2712.kitchen;

public enum  Dish {
    Fish,
    Steak,
    Soup,
    Juice,
    Water;

    public static String allDishesToString() {
        Dish[] dish = Dish.values();
        String result = "";
        for (Dish d : dish) {
            result += d.toString() + ", ";
        }
        return result.substring(0, result.length()-2);
    }
}
