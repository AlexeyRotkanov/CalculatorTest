package com.epam.at.junittests;

import org.junit.Assert;
import org.junit.Test;


public class CosineTest extends ConfigurationTest {

    @Test
    public void cosineTest() {
        long a = 90; // in degrees
        double result = calculator.cos(Math.toRadians(a));
        Assert.assertEquals(0, result, 0.01);
    }
}
