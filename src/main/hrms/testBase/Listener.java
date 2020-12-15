package com.hrms.testBase;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Test;
import com.hrms.Utils.CommonMethods;

public class Listener implements ITestListener {
//	
//@Override
//public void onTestStart(ITestResult result) {
//System.out.println("Functionaly Testing Started ");
//}	
@Override
public void onTestStart(ITestResult result) {
System.out.println("Test Started "+result.getName());
BaseClass.test=BaseClass.report.createTest(result.getName());
};
@Override
public void onTestSuccess(ITestResult result) {
System.out.println("Test Pased "+result.getName());
BaseClass.test.pass("Tesr Case pass "+result.getName());
try {
BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreeenshot("passed/"+result.getName()));
}catch(IOException e) {
e. printStackTrace();
}
}
@Override
public void onTestFailure(ITestResult result) {
System.out.println("Test Failed "+result.getName());
BaseClass.test.fail("Tesr Case Failed "+result.getName());
try {
BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreeenshot("passed/"+result.getName()));
}catch(IOException e) {
e. printStackTrace();
}}}