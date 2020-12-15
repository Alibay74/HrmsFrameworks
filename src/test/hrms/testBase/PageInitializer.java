package com.hrms.testBase;
import com.hrms.page.AddEmployeePageElements;
import com.hrms.page.DashboardPageElements;
import com.hrms.page.LoginPageElements;
import com.hrms.page.PersonalDetailsPageElement;
import com.hrms.page.sauceLoginPage;

//initialize all pages class and stores reference in static variable
//that will called/used in test classes
public class PageInitializer extends BaseClass {
	
public static LoginPageElements login;
public static AddEmployeePageElements addEmp;
public static DashboardPageElements dashboard;
public static PersonalDetailsPageElement pdetails;
public static sauceLoginPage sauceDemoPage;

public static void initialize() {

login=new LoginPageElements();
dashboard=new DashboardPageElements();
addEmp= new AddEmployeePageElements();
pdetails=new PersonalDetailsPageElement();
sauceDemoPage=new sauceLoginPage();
}
}
 