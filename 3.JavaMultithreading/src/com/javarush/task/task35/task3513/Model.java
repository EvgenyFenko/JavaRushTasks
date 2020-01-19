package com.javarush.task.task35.task3513;

import java.util.*;

public class Model<MoveEfficiency> {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;
    int score;
    int maxTile;
    private boolean isSaveNeeded = true;
    private Stack<Tile[][]> previousStates = new Stack<>();
    private Stack<Integer> previousScores = new Stack<>();

    public Model() {
        resetGameTiles();
        score = 0;
        maxTile = 0;
    }

    public Tile[][] getGameTiles() {
        return gameTiles;
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

    public void left() {
        if (isSaveNeeded) {
            saveState(gameTiles);
        }
        boolean isChanged = false;
        for (Tile[] tiles : gameTiles) {
            if (compressTiles(tiles) | mergeTiles(tiles)) {
                isChanged = true;
            }
        }
        if (isChanged) {
            addTile();
        }
        isSaveNeeded = true;
    }

    public void down() {
        saveState(gameTiles);
        turn();
        left();
        turn();
        turn();
        turn();
    }

    public void right() {
        saveState(gameTiles);
        turn();
        turn();
        left();
        turn();
        turn();
    }

    public void up() {
        saveState(gameTiles);
        turn();
        turn();
        turn();
        left();
        turn();
    }

    public void turn() {
        Tile[][] tiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                tiles[i][j] = new Tile();
            }
        }
        for (int i = gameTiles.length - 1; i >= 0; i--) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                tiles[j][gameTiles.length - 1 - i].value = gameTiles[i][j].value;
            }
        }
        gameTiles = tiles;
    }

    private void saveState(Tile[][] tiles) {
        Tile[][] newTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                newTiles[i][j] = new Tile();
                newTiles[i][j].value = tiles[i][j].value;
            }
        }
        previousStates.push(newTiles);
        previousScores.push(score);
        isSaveNeeded = false;
    }

    public boolean canMove() {
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                if (gameTiles[i][j].value == 0) return true;
                if (i != 0 && gameTiles[i - 1][j].value == gameTiles[i][j].value) return true;
                if (j != 0 && gameTiles[i][j - 1].value == gameTiles[i][j].value) return true;
            }
        }
        return false;
    }

//    public void autoMove() {
//        PriorityQueue<MoveEfficiency> queue = new PriorityQueue<>(4, Collections.reverseOrder());
//        queue.offer(getMoveEfficiency(this::left));
//        queue.offer(getMoveEfficiency(this::up));
//        queue.offer(getMoveEfficiency(this::right));
//        queue.offer(getMoveEfficiency(this::down));
//        queue.peek().getMove().move();
//    }

//    public MoveEfficiency getMoveEfficiency(Move move) {
//        int oldScore = score;
//        int oldNumberOfEmptyTiles = getEmptyTiles().size();
//        move.move();
//        int newNumberOfEmptyTiles = getEmptyTiles().size();
//        MoveEfficiency moveEfficiency;
//        if (!hasBoardChanged() && score == oldScore && oldNumberOfEmptyTiles == newNumberOfEmptyTiles) {
//            moveEfficiency = new MoveEfficiency(-1, 0, move);
//        } else {
//            moveEfficiency = new MoveEfficiency(newNumberOfEmptyTiles, score, move);
//        }
//        rollback();
//        return moveEfficiency;
//    }

}
