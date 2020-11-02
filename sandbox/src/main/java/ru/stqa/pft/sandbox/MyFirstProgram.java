package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main (String[] args) {
        Point p1;
        Point p2;
        p1 = new Point (0,0);
        p2 = new Point(2, 0);
        System.out.println(p2.distance(p1));

    }

}

