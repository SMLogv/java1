package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Diagonal1 {

 @Test
  public void testPoint () {
      Point p1;
      Point p2;
      p1 = new Point (0,1);
      p2 = new Point(2, 1);
     Assert.assertEquals(p2.distance(p1), 2);

 }
    @Test
    public void testPoint2 () {
        Point p1;
        Point p2;
        p1 = new Point (1,1);
        p2 = new Point(-1, 1);
        Assert.assertEquals(p2.distance(p1), 10);

    }

    @Test
    public void testPoint3 () {
        Point p1;
        Point p2;
        p1 = new Point (0,5);
        p2 = new Point(0, 1);
        Assert.assertEquals(p2.distance(p1), 4);

    }


}
