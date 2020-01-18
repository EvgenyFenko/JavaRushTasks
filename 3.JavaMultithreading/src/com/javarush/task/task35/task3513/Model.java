package com.javarush.task.task35.task3513;

public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;

    public Model() {
        gameTiles =  new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
    }
}
