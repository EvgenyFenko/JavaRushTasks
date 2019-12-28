package com.javarush.task.task24.task2413;

public class Ball extends BaseObject {
    private double speed;
    private double direction;
    private double dx;
    private double dy;

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.speed = speed;
        this.direction = direction;
        isFrozen = true;
    }

    private boolean isFrozen;

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(this.getX(), this.getY(), 'O');

    }

    @Override
    public void move() {
        if (!isFrozen) {
//            this.setX(this.getX() + dx);
//            this.setY(this.getY() + dy);
            this.x += dx;
            this.y += dy;
        }
    }

    public void start() {
        this.isFrozen = false;
    }

    public void setDirection () {

    }
}
