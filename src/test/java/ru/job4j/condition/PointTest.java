package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to11then1dot41() {
        Point first = new Point(0, 0);
        Point second = new Point(1, 1);
        double out = first.distance(second);
        double expected = 1.41;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to03then3() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 3);
        double out = first.distance(second);
        double expected = 3;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to68then10() {
        Point first = new Point(0, 0);
        Point second = new Point(6, 8);
        double out = first.distance(second);
        double expected = 10;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to111then1dot73() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(1, 1, 1);
        double out = first.distance3d(second);
        double expected = 1.73;
        Assert.assertEquals(expected, out, 0.01);
    }
}