package com.epam.at.testngtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationTest extends ConfigurationTest {

    @Test(description = "Test of multiplication operation", dataProvider = "valuesForMultiplication",
            groups = {"common"})
    public void multiplicationTest(double a, double b, double expectedResult) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Incorrect multiplication of " + a + " - " + b + ". ");
    }

    @DataProvider(name = "valuesForMultiplication")
    public Object[][] valuesForMultiplication() {
        return new Object[][]{
                {2, 2, 4},
                {-5, -3, 15},
                {-4, 1, -4},
                {11, 0, 0}
        };
    }
}
