package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K1dot5Square6() {
        int expected = 6;
        int p = 10;
        double k = 1.5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP16K3Square12() {
        int expected = 12;
        int p = 16;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}