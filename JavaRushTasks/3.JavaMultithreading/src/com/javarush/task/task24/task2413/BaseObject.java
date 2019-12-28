package com.javarush.task.task24.task2413;

public abstract class BaseObject {
    protected double x;
    protected double y;
    protected double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public abstract void  draw(Canvas canvas);

    public abstract void move();

    public boolean isIntersec(BaseObject o) {
        double distanse;
        double diffX;
        double diffY;
        diffX = this.getX() - o.getX();
        diffY = this.getY() - o.getY();
        distanse = Math.sqrt(diffX*diffX + diffY*diffY);
        return distanse <= Math.max(this.radius, o.radius);
    }
}
