package com.javarush.task.task35.task3513;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;
    int score;
    int maxTile;

    public Model() {
        resetGameTiles();
        score = 0;
        maxTile = 0;
    }

    private List<Tile> getEmptyTiles() {
        List<Tile> emptyTiles = new ArrayList<>();
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                if (gameTiles[i][j].isEmpty()) {
                    emptyTiles.add(gameTiles[i][j]);
                }
            }
        }
        return emptyTiles;
    }

    private void addTile() {
        List<Tile> emptyTiles = getEmptyTiles();
        if (emptyTiles.size() == 0) return;
        Tile randomTile = emptyTiles.get((int) (Math.random() * emptyTiles.size()));
        randomTile.value = Math.random() < 0.9 ? 2 : 4;
    }

    public void resetGameTiles() {
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
    }

    private boolean mergeTiles(Tile[] tiles) {
        boolean isChanged = false;
        for (int i = 1; i < tiles.length; i++) {
            if (tiles[i].value != 0 && tiles[i - 1].value == tiles[i].value) {
                isChanged = true;
                tiles[i - 1].value = tiles[i - 1].value * 2;
                for (int j = i + 1; j < tiles.length; j++) {
                    tiles[j - 1].value = tiles[j].value;
                }
                tiles[tiles.length - 1].value = 0;

                score += tiles[i - 1].value;
                if (tiles[i - 1].value > maxTile) maxTile = tiles[i - 1].value;
            }
        }
        return isChanged;
    }

    private boolean compressTiles(Tile[] tiles) {
        boolean isChanged = false;
        for (int i = 1; i < tiles.length; i++) {
            int index = i;
            while (index != 0 && tiles[index - 1].isEmpty() && !tiles[i].isEmpty()) {
                index--;
            }
            if (index != i) {
                tiles[index].value = tiles[i].value;
                tiles[i].value = 0;
                isChanged = true;
            }
        }
        return isChanged;
    }

}
