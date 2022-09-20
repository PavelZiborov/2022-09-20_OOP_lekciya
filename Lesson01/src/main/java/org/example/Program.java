package org.example;

public class Program {
    static double distance(Point2D a, Point2D b) {
        return  Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public static void main(String[] args) {

        Point2D a = new Point2D(0,2);
        System.out.println(a); // x: 0; y: 2
        a.setX(10);
        a.setY(15);

        System.out.println(a);

        System.out.println(a.getX());

        Point2D b = new Point2D(10);
        System.out.println(b);

        Point2D c = new Point2D(0);
        System.out.println(c);


        System.out.println(distance(a,b));



    }
}
