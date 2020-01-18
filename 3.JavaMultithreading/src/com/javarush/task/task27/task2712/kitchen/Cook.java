package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Cook extends Observable implements Observer {
    String name;

    public Cook(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

//    @Override
//    public void update(Observable observable, Object o) {
//        Order order = (Order) o;
//        ConsoleHelper.writeMessage("Start cooking - " + order + ", cooking time " + order.getTotalCookingTime() + "min");
//        setChanged();
//        notifyObservers(o);
//    }

        public void update(Observable tablet, Object arg) {
        Order order = (Order) arg;
        ConsoleHelper.writeMessage(
                "Start cooking - " + order + ", cooking time " + order.getTotalCookingTime() + "min");
//        StatisticManager.getInstance().register(new CookedOrderEventDataRow(
//                tablet.toString(),
//                name,
//                order.getTotalCookingTime() * 60,
//                order.getDishes()));
        setChanged();
<<<<<<< HEAD
        notifyObservers(o);
        ConsoleHelper.writeMessage("Start cooking - " + o + ", cooking time " + ((Order) o).getTotalCookingTime() + "min");
=======
        notifyObservers(order);
>>>>>>> tmp
    }

}
