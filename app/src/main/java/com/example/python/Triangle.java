package com.example.python;

public class Triangle extends Shape {
    private float area;
    public Triangle(int base, int height) {
        x = base;
        y = height;
        calcArea();
    }

    private void calcArea() {
        area = (float) (x * y) /2;
    }

    public float getArea() {
        return area;
    }

    public int getBase() {
        return x;
    }

    public int getHeight() {
        return y;
    }

    public void setBase(int base) {
        x = base;
        calcArea();
    }

    public void setHeight(int height) {
        y = height;
        calcArea();
    }
}
