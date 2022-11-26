package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to11then1dot41() {
        double expected = 1.41;
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to03then3() {
        double expected = 3;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to68then10() {
        double expected = 10;
        int x1 = 0;
        int y1 = 0;
        int x2 = 6;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}