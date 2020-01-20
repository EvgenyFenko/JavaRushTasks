package com.javarush.task.task25.task2515;

import java.util.ArrayList;
import java.util.List;

public class Space {
    private int width;
    private int height;
    public static Space game;




    //Космический корабль
    private SpaceShip ship;
    //Список НЛО
    private List<Ufo> ufos = new ArrayList<Ufo>();
    //Список бомб
    private List<Bomb> bombs = new ArrayList<Bomb>();
    //Список ракет
    private List<Rocket> rockets = new ArrayList<Rocket>();

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public SpaceShip getShip() {
        return ship;
    }

    public List<Ufo> getUfos() {
        return ufos;
    }

    public List<Bomb> getBombs() {
        return bombs;
    }

    public List<Rocket> getRockets() {
        return rockets;
    }

    public void run() {

    }

    public void draw() {

    }

    public void sleep(int ms) {

    }

    public static void main(String[] args) {
        
    }
}
