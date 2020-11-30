package com.epam.at.testngtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangentTest extends ConfigurationTest {

    @Test(dataProvider = "valuesForTangentTests", groups = {"trigonometry"})
    public void sine(double a, double expectedResult) {
        double result = calculator.tg(Math.toRadians(a));
        Assert.assertEquals(result, expectedResult, "Incorrect tan of " + a + ": ");
    }

    @DataProvider(name = "valuesForTangentTests")
    public Object[][] valuesForTangentTests() {
        return new Object[][] {
                {0, 0},
                {45, 1}
        };
    }
}
