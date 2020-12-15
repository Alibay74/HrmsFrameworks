package com.hrms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.Utils.CommonMethods;

public class sauceLoginPage extends CommonMethods {
	
@FindBy(id="user-name")
public WebElement userNameTextBox;

@FindBy(id="password")
public  WebElement passwordTextBox;

@FindBy(xpath="//input[@class='btn_action']")
public WebElement loginButton;

@FindBy(xpath="//h3[contains(text(),'Epic sadface')]")
public Object errorMsg;

@FindBy(xpath="//div[text()='Products']")
public Object headerText;


public sauceLoginPage() {
PageFactory.initElements(driver, this);	

}
}
