package com.workingWithAbstraction.exercise.jediGalaxy;

public class Jedi {
    private int row;
    private int col;
    private long stars;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void collectStar(int value) {
        this.stars += value;
    }

    public long getStars() {
        return stars;
    }
}
