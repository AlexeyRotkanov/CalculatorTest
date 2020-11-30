package com.epam.at.testngtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SineTest extends ConfigurationTest {

    @Test(dataProvider = "valuesForSineTests", groups = {"trigonometry"})
    public void sine(double a, double expectedResult) {
        double result = calculator.sin(Math.toRadians(a));
        Assert.assertEquals(result, expectedResult, "Incorrect sin of " + a + ": ");
    }

    @DataProvider(name = "valuesForSineTests")
    public Object[][] valuesForSineTests() {
        return new Object[][] {
                {0, 0},
                {90, 1}
        };
    }
}
