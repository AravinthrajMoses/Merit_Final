package com.merit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.merit.base.Base;

public class AddProduct_Deactivate_Verify extends Base {

	@FindBy(xpath="//*[@id='details-button']")
	public static WebElement advanced2;

	@FindBy(xpath="//*[@id='proceed-link']")
	public static WebElement proceedlink2;

	@FindBy(xpath="//*[@class='User Name']")
	public static WebElement username2;

	@FindBy(xpath="//*[@class='Password']")
	public static WebElement password2;

	@FindBy(xpath="//*[@class='submit-btn']")
	public static WebElement login2;
	
	
	@FindBy(xpath="(//*[@class='accordion-toggle wave-effect waves-effect waves-button'])[2]")
	public static WebElement eproduct1;

	@FindBy(xpath = "//*[text()='All Products']")
	public static WebElement eallpro1;
	
	@FindBy(xpath = "(//*[@class='current'])[1]")
	public static WebElement sel;
	
	@FindBy(xpath = "(//*[text()='Deactivated'])[2]")
	public static WebElement sel1;
	
	
	public static void allProduct() {
		
		Base.objectcreation();
		Base.adminUrl();

		PageFactory.initElements(driver, AddProduct_Deactivate_Verify.class);

	}
	
	public static void log1() {
		
		wait.until(ExpectedConditions.elementToBeClickable(advanced2)).click();
		wait.until(ExpectedConditions.elementToBeClickable(proceedlink2)).click();
		username2.sendKeys(prop.getProperty("username"));
		password2.sendKeys(prop.getProperty("password"));
		login2.click();
		
	}
	
	public static void stat() {
		
		wait.until(ExpectedConditions.elementToBeClickable(eproduct1)).click();
		wait.until(ExpectedConditions.elementToBeClickable(eallpro1)).click();
		
	}


	public static void status() {

		wait.until(ExpectedConditions.elementToBeClickable(sel)).click();
		wait.until(ExpectedConditions.elementToBeClickable(sel1)).click();

	}
	public static void close() {
		
		driver.close();
		
	}

}