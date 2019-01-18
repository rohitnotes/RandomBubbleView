package com.yuntu.scdemo;

import android.util.Log;

import java.util.Random;

public class BallisticBlank {

    private int row;

    private int left;

    private int right;

    private int targetTextwidth;

    private int index;

    public BallisticBlank(int row, int left, int right, int width, int index) {
        this.row = row;
        this.left = left;
        this.right = right;
        this.targetTextwidth = width;
        this.index = index;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getTargetTextwidth() {
        return targetTextwidth;
    }

    public void setTargetTextwidth(int targetTextwidth) {
        this.targetTextwidth = targetTextwidth;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    /*public int getLeftRange(Random random) {
        Log.i("Gmw","")
        return left + random.nextInt(right - width - left);
    }*/

    @Override
    public String toString() {
        return "{row=" + row + ",left=" + left + ",right=" + right + ",targetTextwidth=" + targetTextwidth + ",index=" + index + "}";
    }
}