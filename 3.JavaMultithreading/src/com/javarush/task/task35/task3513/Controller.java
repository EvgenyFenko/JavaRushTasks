package com.javarush.task.task35.task3513;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controller extends KeyAdapter {
    private Model model;
    private View view;
    private static final int WINNING_TILE = 2048;
    private volatile int speed = 600;

    public Controller(Model model) {
        this.model = model;
        this.view = new View(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            resetGame();
        } else if (!model.canMove()) {
            view.isGameLost = true;
        } else if (!view.isGameLost && !view.isGameWon) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    model.left();
                    break;
                case KeyEvent.VK_RIGHT:
                    model.right();
                    break;
                case KeyEvent.VK_UP:
                    model.up();
                    break;
                case KeyEvent.VK_DOWN:
                    model.down();
                    break;
                case KeyEvent.VK_Z:
                    model.rollback();
                    break;
                case KeyEvent.VK_R:
                    model.randomMove();
                    break;
            }
            if (model.maxTile == WINNING_TILE) {
                view.isGameWon = true;
            }
        }
        view.repaint();
    }

//    @Override
//    public void keyPressed(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
//            resetGame();
//        } else if (!model.canMove()) {
//            view.isGameLost = true;
//        } else if (!view.isGameLost && !view.isGameWon) {
//            switch (e.getKeyCode()) {
//                case KeyEvent.VK_LEFT:
//                    model.left();
//                    break;
//                case KeyEvent.VK_RIGHT:
//                    model.right();
//                    break;
//                case KeyEvent.VK_UP:
//                    model.up();
//                    break;
//                case KeyEvent.VK_DOWN:
//                    model.down();
//                    break;
//                case KeyEvent.VK_Z:
//                    model.rollback();
//                    break;
//                case KeyEvent.VK_R:
//                    model.randomMove();
//                    break;
//                case KeyEvent.VK_A:
//                    model.autoMove();
//                    break;
//                case KeyEvent.VK_N:
//                    startNeural();
//                    break;
//                case KeyEvent.VK_K:
//                    if (speed >= 100) {
//                        speed -= 50;
//                    }
//                    System.out.println("speed : " + speed);
//                    break;
//                case KeyEvent.VK_L:
//                    if(speed <= 1450) {
//                        speed += 50;
//                    }
//                    System.out.println("speed : " + speed);
//                    break;
//            }
//            if (model.maxTile == WINNING_TILE) {
//                view.isGameWon = true;
//            }
//        }
//        view.repaint();
//    }

//    public void startNeural() {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (!view.isGameWon) {
//                    try {
//                        Thread.sleep(speed);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    if(!model.canMove()) {
//                        view.isGameLost = true;
//                        view.repaint();
//                        break;
//                    }
//                    model.autoMove();
//                    view.repaint();
//                }
//            }
//        });
//        thread.start();
//    }

    public void resetGame() {
        view.isGameLost = false;
        view.isGameWon = false;
        model.score = 0;
        model.maxTile = 0;
        model.resetGameTiles();
    }

    public Tile[][] getGameTiles() {
        return model.getGameTiles();
    }

    public int getScore() {
        return model.score;
    }

    public View getView() {
        return view;
    }
}
