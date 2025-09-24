package com.example.python;

public class Pentagon extends Shape{
    private int side_length;

    public Pentagon(int x, int y, int side_length) {
        super(x,y);
        this.side_length = side_lenth;
    }

    public int getSideLength() {
        return side_length;
    }
    public void setSideLength(int side_length) {
        this.side_length = side_length;
    }
}
