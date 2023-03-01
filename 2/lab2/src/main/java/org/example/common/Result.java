package org.example.common;

public class Result {
    private int[][] result;

    public Result(int row, int column) {
        result = new int[row][column];
    }

    public void setElement(int row, int column, int element) {
        this.result[row][column] = element;
    }

    public void addToElement(int row, int column, int toAdd) {
        this.result[row][column] += toAdd;
    }

    public int getElement(int row, int column) {
        return this.result[row][column];
    }

    public int[][] getResult() {
        return this.result;
    }
}
