package com.merit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.merit.base.Base;

public class AddProduct_Edit_Verify extends Base {


	@FindBy(xpath="//*[@id='details-button']")
	public static WebElement advanced1;

	@FindBy(xpath="//*[@id='proceed-link']")
	public static WebElement proceedlink1;

	@FindBy(xpath="//*[@class='User Name']")
	public static WebElement username1;

	@FindBy(xpath="//*[@class='Password']")
	public static WebElement password1;

	@FindBy(xpath="//*[@class='submit-btn']")
	public static WebElement login1;
	
	
	@FindBy(xpath="(//*[@class='accordion-toggle wave-effect waves-effect waves-button'])[2]")
	public static WebElement eproduct;

	@FindBy(xpath = "//*[text()='All Products']")
	public static WebElement eallpro;

	@FindBy(xpath ="(//*[@class='go-dropdown-toggle'])[1]")
	public static WebElement actions;

	@FindBy(xpath ="(//*[@class='fas fa-edit'])[2]")
	public static WebElement edit;  

	@FindBy(xpath ="(//*[@class='input-field'])[9]")
	public static WebElement text;

	@FindBy(xpath = "//*[@class='addProductSubmit-btn']")
	public static WebElement sv;



	public static void actions() 

	{

		Base.objectcreation();
		Base.adminUrl();

		PageFactory.initElements(driver, AddProduct_Edit_Verify.class);
	}
	
	public static void log()  {

		wait.until(ExpectedConditions.elementToBeClickable(advanced1)).click();
		wait.until(ExpectedConditions.elementToBeClickable(proceedlink1)).click();
		username1.sendKeys(prop.getProperty("username"));
		password1.sendKeys(prop.getProperty("password"));
		login1.click();

	}


	public static void edit() {

		wait.until(ExpectedConditions.elementToBeClickable(eproduct)).click();

		wait.until(ExpectedConditions.elementToBeClickable(eallpro)).click();

		wait.until(ExpectedConditions.elementToBeClickable(actions)).click();

		wait.until(ExpectedConditions.elementToBeClickable(edit)).click();

	}

	public static void text() {

		AddProduct_Edit_Verify.text.sendKeys("350");
		AddProduct_Edit_Verify.sv.click();

	}

	public static void name() throws Exception {

		Thread.sleep(5000);
		driver.close();

	}


}
