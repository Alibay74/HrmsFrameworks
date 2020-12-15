package com.hrms.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.Utils.CommonMethods;
import com.hrms.Utils.ConfigsReader;
import com.hrms.Utils.Constants;
import com.hrms.Utils.ExcelUtility;

//import freemarker.template.utility.Constants;

public class AddEmployeeTest extends CommonMethods {

@Test(dataProvider="userDataFromExcel",groups= {"homework","addEmp","regression"})
public void addEmployee(String firstName,String lastName,String username,String password) throws InterruptedException {
// System.out.println(firstName+" "+lastName+" "+username+" "password);
	
// Login into HRMS
login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));

// Navigate to Add Employee page
dashboard.navigateToAddEmployee();
wait();

// Add emploee information
sendText(addEmp.firstName,firstName);
sendText(addEmp.lastName,lastName);

// Get EmployeeID
String expectedEmpId=addEmp.employeeId.getAttribute("value");

// Click on Create Login Details
click(addEmp.checkboxLoginDetails);
wait(1);
sendText(addEmp.username,username);
sendText(addEmp.password,password);
sendText(addEmp.confirmPassword,password);
wait(1);
click(addEmp.saveBtn);
wait(1);

// Validation
waitForClickability(pdetails.lblPersnalDetails);
String actualEmpId=pdetails.employeeId,getAttribute("value");
Assert.assertEquals(actualEmpId, expectedEmpId,"Employee ID did not match!");

// Take screenshot
takeScreeenshot(firstName+"-"+lastName);	
}
@DataProvider(name="userData")
public Object[][] getData(){
Object[][]data= {{"Rajma", "Capoora","raj123435345","AmirKhan_@123"},
{"John","Smith","john1234","AmirKhan_@123"},{"Mary","Ann","mary123","AmirKhan_@123"},
{"Rohani","Sakhi","rohani123","AmirKhan_@123"},{"Ali","Tarlaci","ali123","AmirKhan_@123"},};
return data;	
}
@DataProvider(name="userDataFromExcel")
public Object[][]getData2(){
return ExcelUtility.excelIntoArray(Constants.TESTDATA_FILEPATH,"EmployeeLoginCredentials");
}

@BeforeMethod
public void openBrowser() {
setUp();
initialize();
}
@AfterMethod
public void closeBrowser() {
tearDown();
}
@Test
public void addEmployeePage () throws InterruptedException {
	
	
login.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));
dashboard.navigateToAddEmployee();
wait(7);	

}
}


