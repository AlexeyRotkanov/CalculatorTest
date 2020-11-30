package com.epam.at.testngtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CotangentTest extends ConfigurationTest {

    @Test(dataProvider = "valuesForCotangentTests", groups = {"trigonometry"})
    public void sine(double a, double expectedResult) {
        double result = calculator.ctg(Math.toRadians(a));
        Assert.assertEquals(result, expectedResult, "Incorrect ctg of " + a + ": ");
    }

    @DataProvider(name = "valuesForCotangentTests")
    public Object[][] valuesForCotangentTests() {
        return new Object[][] {
                {90, 0},
                {45, 1}
        };
    }
}
