package com.javarush.task.task24.task2413;

import java.util.List;

public class Arkanoid {

    static Arkanoid game;

    private int width;
    private int height;
    private Ball ball;
    private Stand stand;

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public Ball getBall() {
        return ball;
    }

    public Stand getStand() {
        return stand;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    private List<Brick> bricks;

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void run() {

    }

    public void move() {

    }

    public static void main(String[] args) {
        Canvas canvas = new Canvas(20, 20);
        canvas.setPoint(5,5, 'A');
    }
}
