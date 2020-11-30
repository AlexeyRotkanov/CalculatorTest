package com.epam.at.testngtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IsPositiveTest extends ConfigurationTest {

    @Parameters({"operationType"})
    @Test(groups = {"boolean"})
    public void isPositiveTest(@Optional(value="") String operationType) {
        boolean result = calculator.isPositive(1);
        Assert.assertTrue(result, "Incorrect result of isPositive operation for 1. ");

        result = calculator.isPositive(0);
        Assert.assertFalse(result, "Incorrect result of isPositive operation for 0. ");
    }
}
