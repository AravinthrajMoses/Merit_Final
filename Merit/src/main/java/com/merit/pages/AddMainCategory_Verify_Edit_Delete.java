package com.merit.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.merit.base.Base;

public class AddMainCategory_Verify_Edit_Delete extends Base {
	// To WebElements Login  page 

	@FindBy(xpath="//*[@id='details-button']") //advance
	public static WebElement advance;

	@FindBy(xpath="//*[@id='proceed-link']")  //process
	public static WebElement process;

	@FindBy(xpath="//*[@class='User Name'] ")  // username
	public static WebElement username;

	@FindBy(xpath="//*[@class='Password'] ")  //password
	public static WebElement pass;

	@FindBy(xpath="//*[@class='submit-btn']")  //login
	public static WebElement login;

	@FindBy(xpath="(//*[@class='accordion-toggle wave-effect waves-effect waves-button'])[3]")  //manage categories
	public static WebElement manage;
	
	@FindBy(xpath="//*[@id='image-upload']")   //delete create
	public static WebElement mainupload;
	
	//main category 

	@FindBy(xpath="//*[@id=\"menu5\"]/li[1]/a/span")  //main category
	public static WebElement main;

	@FindBy(xpath="//*[@id='add-data']")  //Add New Category
	public static WebElement addnew;

	@FindBy(xpath="(//*[@class='input-field'])[1]")  //main category name
	public static WebElement mname;

	@FindBy(xpath="(//*[@class='input-field'])[2]")  //slug
	public static WebElement sname;
	
	@FindBy(xpath="(//*[@class='fas fa-trash-alt'])[3]")  //main category delete
	public static WebElement maindelete;
	
	@FindBy(xpath="//*[@class='btn btn-danger btn-ok']")  //delete confirm
	public static WebElement mdelete;
	
	@FindBy(xpath="//*[@class='addProductSubmit-btn']")   //delete create
	public static WebElement subupload;


	public static void driverurl() 
	{
		Base.objectcreation();
		PageFactory.initElements(driver,AddMainCategory_Verify_Edit_Delete .class);
		Base.adminUrl();
		advance.click();
		process.click();
	//	Actions action = new Actions(driver);

	}
	public static void username()	
	{
		username.sendKeys(prop.getProperty("username"));
	}
	public static void password()	
	{
		pass.sendKeys(prop.getProperty("password"));
	}
	public static void login () 
	{
		try {
			Thread.sleep(3000);
			login.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void manage () 
	{
		try {
			Thread.sleep(3000);
			manage.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void maincategory () 
	{
		try {
			Thread.sleep(3000);
			main.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void addnew () 
	{
		try {
			Thread.sleep(3000);
			addnew.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void productcategory() 	
	{
		try {
			Thread.sleep(3000);
			mname.sendKeys(prop.getProperty("catname"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void productname() 	
	{
		try {
			Thread.sleep(3000);
			sname.sendKeys(prop.getProperty("slug"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void maincategoryfileupload()  //main category photo upload
	{
		
		try {
			Actions up=new Actions(driver);
			Thread.sleep(3000);
			up.moveToElement( mainupload).click().build().perform();
			Thread.sleep(3000);
			String file ="C:\\Users\\ARAVINTH\\OneDrive\\Desktop\\Project\\merge\\Merit\\Merit_Image\\purse.jpeg";
			Thread.sleep(3000);
			StringSelection select =new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
			Robot rob1 = new Robot();
	        rob1.keyPress(KeyEvent.VK_CONTROL);
	        Thread.sleep(3000);
			rob1.keyPress(KeyEvent.VK_V);
			rob1.keyRelease(KeyEvent.VK_V);
			Thread.sleep(3000);
			rob1.keyRelease(KeyEvent.VK_CONTROL);
			rob1.keyPress(KeyEvent.VK_ENTER);
			rob1.keyRelease(KeyEvent.VK_ENTER);
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void maincategory_create() 	 //main category photo upload create
	{
		
		try {
			Actions up2=new Actions(driver);
			Thread.sleep(3000);
			up2.moveToElement(subupload).click().build().perform();
			
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void maindelet() 
	{
		try {
			Thread.sleep(3000);
			maindelete.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void mainconfromdelete() 	
	{
		try {
			Thread.sleep(3000);
			mdelete.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void tabclose()
	{
		try {
			Thread.sleep(3000);
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}