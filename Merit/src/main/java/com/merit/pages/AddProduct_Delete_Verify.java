package com.merit.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.merit.base.Base;

public class AddProduct_Delete_Verify extends Base{
	
	@FindBy(xpath="//*[@id='details-button']")
	public static WebElement advanced;

	@FindBy(xpath="//*[@id='proceed-link']")
	public static WebElement proceedlink;

	@FindBy(xpath="//*[@class='User Name']")
	public static WebElement username;

	@FindBy(xpath="//*[@class='Password']")
	public static WebElement password;

	@FindBy(xpath="//*[@class='submit-btn']")
	public static WebElement login;

	@FindBy(xpath="(//*[@class='accordion-toggle wave-effect waves-effect waves-button'])[2]")
	public static WebElement product;
	
	@FindBy (xpath = "//*[text()='Deactivated Product']")
	public static WebElement deac;
	
	@FindBy(xpath = "//*[@class='go-dropdown-toggle']")
	public static WebElement act;
	
	@FindBy(xpath = "//*[@class='delete']")
	public static WebElement del;
	
	@FindBy(xpath = "//*[@class='btn btn-danger btn-ok']")
	public static WebElement delbt;
	
	
	public static void actions() {
		
		Base.objectcreation();
		Base.adminUrl();

		PageFactory.initElements(driver, AddProduct_Delete_Verify.class);

	}

	public static void log()  {

		wait.until(ExpectedConditions.elementToBeClickable(advanced)).click();
		wait.until(ExpectedConditions.elementToBeClickable(proceedlink)).click();
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		login.click();
	}
	
	public static void delete() {

		wait.until(ExpectedConditions.elementToBeClickable(product)).click();
		wait.until(ExpectedConditions.elementToBeClickable(deac)).click();
	}
	
	public static void ok() {
		
		wait.until(ExpectedConditions.elementToBeClickable(act)).click();
		wait.until(ExpectedConditions.elementToBeClickable(del)).click();
		wait.until(ExpectedConditions.elementToBeClickable(delbt)).click();
	}

	public static void close() {
		
		driver.close();
		
	}

}
