package com.epam.at.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test fail: " + result.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test start: " + result.getName());
    }
}
