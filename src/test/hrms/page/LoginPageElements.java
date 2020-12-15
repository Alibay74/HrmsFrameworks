package com.hrms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.Utils.CommonMethods;
import com.hrms.testBase.BaseClass;

public class LoginPageElements extends CommonMethods {
// Not using PageFactory, You have to extend CommonMethods or BaseClass
// public WebElement username2=driver.findElement(By.id("txtUsername"));

// Using PageFactory and @FindBy Annotation
	@FindBy(id="txtUsername")
	public WebElement username;

	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(css="input#btnlogin")
	public WebElement loginBttn;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	public WebElement logo;

	@FindBy(id="spanMessage")
	public WebElement errorMsg;

	public LoginPageElements() {
	PageFactory.initElements(BaseClass.driver, this);
	}
	//If we would be keeping elements as private
	//them we will need to create public getters and setters
	//so we can access page elements from test classes
	
	// Setter
	public void sendUsername (String uid) {
	sendText(username,uid);
	}
	// Getter
	public WebElement getUsername() {
	return username;
	}
	public void login(String uid, String pwd) {
	sendText(username,uid);
	sendText(password,pwd);
	click(loginBttn);
	}
	public void login1(String property, String property2) {
	}
    }
	
	

