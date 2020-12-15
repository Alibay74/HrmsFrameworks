package com.hrms.testCases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.hrms.Utils.CommonMethods;
import com.hrms.Utils.ConfigsReader;


public class LoginTest extends CommonMethods {
	
//@BeforeMethod
//public void openBrowser() {
//setUp();
//initialize();
////}
////private void initialize() {	
//}
//@AfterMethod
//public void closeBrowser() {
//tearDown();	
//}
//	
@Test(groups="smoke")
public void  validAdminLogin() {
//LoginPageElements login=new LoginPageElements();
sendText(login.username,ConfigsReader.getProperty("username"));
sendText(login.password,ConfigsReader.getProperty("password"));
click(login.loginBttn);

//DashboardPageElements dashboard=new DashboardPageElements();
String exceptedUser="Welcome Admin";
String actualUser=dashboard.welcome.getText();
AssertJUnit.assertEquals(actualUser, exceptedUser,"Admin is Not logged in");  //  org.testng.
AssertJUnit.assertTrue(actualUser.contains(ConfigsReader.getProperty("username")));

}
@Test(groups="regression")
public void invalidPasswordLogin() {
//LoginPageElements login=new LoginPageElements();
sendText(login.username,ConfigsReader.getProperty("username"));
sendText(login.password,"uiuguig");

String expected="Invalid credentials";
AssertJUnit.assertEquals(login.errorMsg.getText(),expected,"Error message text is not matched");

}
@Test(enabled=true)
public void emptyUsernameLogin() {
//LoginPageElements login=new LoginPageElements();
sendText(login.password,ConfigsReader.getProperty("password"));
click(login.loginBttn);

String expected="Username cannot be empty";
AssertJUnit.assertEquals(login.errorMsg.getText(),expected,"Error message text is");

}
}
