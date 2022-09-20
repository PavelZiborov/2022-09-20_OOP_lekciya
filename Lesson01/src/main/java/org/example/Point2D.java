package org.example;

/**
 * Это точка 2D
 * */
public class Point2D {
    private int x, y;

    /**
     * Это конструктор ...
     * @param valueX это коортината X
     * @param valueY это коортината Y
     * */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value,value);
    }

    public Point2D() {
        this(0);
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    @Override
    public String toString() {
        return String.format("x: %d; y: %d", x,y);
    }
}

