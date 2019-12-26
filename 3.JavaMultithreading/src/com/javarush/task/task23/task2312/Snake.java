package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public Snake(int x, int y) {
        SnakeSection head = new SnakeSection(x, y);
        sections = new ArrayList<>();
        this.sections.add(head);
        this.isAlive = true;
    }

    public int getX() {
        SnakeSection head = sections.get(0);
        return head.getX();
    }

    public int getY() {
        SnakeSection head = sections.get(0);
        return head.getY();
    }

    public void move() {

    }

}
