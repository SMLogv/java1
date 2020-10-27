package ru.stqa.pft.sandbox;

public class MyFirstProgram {
/*
    public static void main (String[] args) {

        System.out.println("Hello world!");

    Point p = new Point(9.0009, -9);
        System.out.println("икс =" +p.x+  ", игрик =" +p.y);


}

    public static double distance(Point p1, Point p2) {
        p1 = new Point (1, 1);
        p2 = new Point (10, -7);
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
*/
    public static void main(String[] args) {
        Point p1 = new Point (1, 1);
        Point p2 = new Point (190, -7);
        System.out.println( Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y)));
                }

}


