package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main (String[] args) {
        Point p1;
        Point p2;
        p1 = new Point (0,-10);
        p2 = new Point(-1, -1);
        System.out.println(p2.distance(p1));

       /* System.out.println("Диагональ такая =" + p1.distance());  */
    }

}