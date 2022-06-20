package com.merit.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.merit.base.Base;

public class AddChildCategory_Verify_Edit_Delete extends Base {

	@FindBy(xpath="//*[@id='details-button']") //advance
	public static WebElement advance;

	@FindBy(xpath="//*[@id='proceed-link']")  //proceed
	public static WebElement process;

	@FindBy(xpath="//*[@class='User Name'] ")  // username
	public static WebElement username;

	@FindBy(xpath="//*[@class='Password'] ")  //password
	public static WebElement pass;

	@FindBy(xpath="//*[@class='submit-btn']")  //login
	public static WebElement login;

	@FindBy(xpath="(//*[@class='accordion-toggle wave-effect waves-effect waves-button'])[3]") //manage categories
	public static WebElement manage;
	
//sub category

	@FindBy(xpath="//*[@id='menu5']/li[2]") //sub category
	public static WebElement smain;

	@FindBy(xpath="//*[@id='add-data']")   //Add New Category
	public static WebElement saddnew;

	@FindBy(xpath="(//*[@class='input-field'])[1]")  //main category name
	public static WebElement smname;

	@FindBy(xpath="(//*[@class='input-field'])[2] ")    //slug
	public static WebElement ssname;
	
	@FindBy(xpath="(//*[@class='fas fa-trash-alt'])[3] ")   //sub category delete
	public static WebElement subdelete;
	
	@FindBy(xpath="//*[@class='btn btn-danger btn-ok'] ")   //delete create
	public static WebElement sdelete;

	public static void driverurl1() 
	{
		Base.objectcreation();
		PageFactory.initElements(driver,AddChildCategory_Verify_Edit_Delete .class);
		Base.adminUrl();
		advance.click();
		process.click();
		
	}

	public static void username1() 	
	{
		username.sendKeys(prop.getProperty("username"));
	}
	public static void password1() 
	{
		pass.sendKeys(prop.getProperty("password"));
	}
	public static void login1() 
	{
		login.click();
	}
	public static void manage ()
	{
		wait.until(ExpectedConditions.elementToBeClickable(manage)).click();
	}
	
	public static void subcategory () 
	{
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(smain)).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void subaddnew () 
	{
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(saddnew)).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void subproductcategory() 	
	{
		try {
			Thread.sleep(3000);
			smname.sendKeys(prop.getProperty("subname"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void subproductname() 	
	{
		try {
			Thread.sleep(3000);
			ssname.sendKeys(prop.getProperty("slugs"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void subcategory_drop_down()   //sub category drop down selection
	{
		try {
			Thread.sleep(3000);
			WebElement se=driver.findElement(By.xpath("//*[@name='category_id']"));
			Select sel =new Select(se);
			sel.selectByIndex(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static void subcategoryfileupload()   //sub category photo upload
	{
		try {
			Thread.sleep(3000);
			WebElement upload=driver.findElement(By.xpath("//*[@id='image-upload']"));
			Actions up=new Actions(driver);
			up.moveToElement(upload).click().build().perform();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
			String file ="C:\\Users\\ARAVINTH\\OneDrive\\Desktop\\Project\\merge\\Merit\\Merit_Image\\purse.jpeg";
			StringSelection select =new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
			Thread.sleep(3000);
			Robot rob =new Robot();
			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public static void subcategory_create()    //sub category photo upload create
	{
		try {
			Thread.sleep(3000);
			WebElement creat=driver.findElement(By.xpath("//*[@class='addProductSubmit-btn']"));
			Actions up2=new Actions(driver);
			up2.moveToElement(creat).click().build().perform();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void subdelet() 	
	{
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(subdelete)).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void subconfromdelete() 	
	{
		try {
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(sdelete)).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void tabclose1()
	{
		driver.close();
	}
		
}















