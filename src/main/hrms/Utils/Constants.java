package com.hrms.Utils;

import com.hrms.testBase.BaseClass;

public class Constants extends BaseClass {

	public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"/src/test/resources/Drivers/chromedriver";
	public static final String GECKO_DRIVER_PATH=System.getProperty("user.dit")+"/src/test/resources/Drivers/geckodriver";
	public static final String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/Configs/Configuration.properties";
	public static final int IMPLICIT_WAIT_TIME=10;
	public static final int EXPLICIT_WAIT_TIME=30;
	public static final String TESTDATA_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/testdata/HrmsTestData.xlsx";
    public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"/target/html-report//HRMS.html";
    public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")+ "/screenshot/";
}
// /Users/apple/eclipse-workspace/java basics/HrmsFrameworks/src/test/resources/TestData