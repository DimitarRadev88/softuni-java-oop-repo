package com.workingWithAbstraction.exercise.jediGalaxy;

public class Galaxy {
    private int[][] field;
    private Jedi jedi;
    private Evil evil;

    public Galaxy(int[][] field, Jedi jedi, Evil evil) {
        this.field = field;
        this.jedi = jedi;
        this.evil = evil;
    }

    public boolean isInBounds(int row, int col) {
        return row >= 0 && row < field.length && col >= 0 && col < field[row].length;
    }

    public void destroyStars() {
        int row = evil.getRow();
        int col = evil.getCol();
        while (row >= 0 && col >= 0) {
            destroyStar(row--, col--);
        }
    }

    public void collectStars() {
        int row = jedi.getRow();
        int col = jedi.getCol();
        while (row >= 0 && col < field[0].length) {
            jedi.collectStar(getStarValue(row--, col++));
        }
    }

    private int getStarValue(int row, int col) {
        int value = 0;
        if (isInBounds(row, col)) {
            value = field[row][col];
        }
        return value;
    }

    private void destroyStar(int row, int col) {
        if (isInBounds(row, col)) {
            field[row][col] = 0;
        }
    }

    public Jedi getJedi() {
        return jedi;
    }

    public Evil getEvil() {
        return evil;
    }
}
