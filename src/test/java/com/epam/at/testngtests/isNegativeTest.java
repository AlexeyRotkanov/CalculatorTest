package com.epam.at.testngtests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class isNegativeTest extends ConfigurationTest {

    @Parameters({"operationType"})
    @Test(groups = {"boolean"})
    public void isNegativeTest(@Optional(value="") String operationType) {
        boolean result = calculator.isNegative(-1);
        Assert.assertTrue(result, "Incorrect result of isNegative operation for -1 value. ");

        result = calculator.isNegative(0);
        Assert.assertFalse(result, "Incorrect result of isNegative operation for 0 value. ");
    }
}
