package com.hrms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.Utils.CommonMethods;

public class AddEmployeePageElements extends com.hrms.Utils.CommonMethods {
	
@FindBy(id="firstName")
public WebElement firstName;

@FindBy(id="lastName")
public WebElement lastName;

@FindBy(id="EmployeeId")
public WebElement EmployeeId;

@FindBy(id="checkLogin")
public WebElement checkboxLoginDetails;

@FindBy(id="user_name")
public WebElement username;

@FindBy(id="user_password")
public WebElement password;

@FindBy(id="re_password")
public WebElement confirmPassword;

@FindBy(id="btnSave")
public WebElement saveBtn;

public Object employeeId;

public  AddEmployeePageElements() {
PageFactory.initElements(driver, this);

}
}
