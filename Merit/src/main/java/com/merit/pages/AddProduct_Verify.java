package com.merit.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.merit.base.Base;

public class AddProduct_Verify extends Base{



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

	@FindBy(xpath = "((//li)[14]//a)[2]//*[text()='Add New Product']")
	public static WebElement productadd;

	@FindBy(xpath = "//*[@class='input-field']")
	public static WebElement productname;

	@FindBy(xpath ="//*[@id='cat']")
	public static WebElement cat;

	@FindBy(xpath ="//*[@id='subcat']")
	public static WebElement subcat;

	@FindBy(xpath ="//*[@id='crop-image']")
	public static WebElement uploadimage;

	@FindBy(xpath = "//*[@class='ok']")
	public static WebElement clicks;


	@FindBy(xpath = "(//*[@class='input-field'])[12]")
	public static WebElement cost;

	@FindBy(xpath = "(//*[@class='input-field'])[9]")
	public static WebElement stock;

	@FindBy(xpath = "//*[@class=' nicEdit-main  ']")
	public static WebElement discription;

	@FindBy(xpath = "//*[@class=' nicEdit-main      ']")
	public static WebElement policy;

	@FindBy(xpath = "//*[@class='addProductSubmit-btn']")
	public static WebElement create;

	@FindBy(xpath = "(//*[@class='text-left'])[1]")
	public static WebElement console;


	public static void buttons()  {

		Base.objectcreation();
		Base.adminUrl();

		PageFactory.initElements(driver, AddProduct_Verify.class);
		wait.until(ExpectedConditions.elementToBeClickable(advanced)).click();
	}

	public static void link() {

		wait.until(ExpectedConditions.elementToBeClickable(proceedlink)).click();

	}

	public static void username() {

		username.sendKeys(prop.getProperty("username"));

	}

	public static void password() {

		password.sendKeys(prop.getProperty("password"));

	}

	public static void login() {

		login.click();

	}

	public static void product()  {

		wait.until(ExpectedConditions.elementToBeClickable(product)).click();

	}
	public static void productadd() {

		wait.until(ExpectedConditions.elementToBeClickable(productadd)).click();
	}

	public static void productname() {

		AddProduct_Verify.productname.sendKeys("shoe");

	}

	public static void cat() {

		Select categ1 = new Select(wait.until(ExpectedConditions.visibilityOf(cat)));
		categ1.selectByVisibleText("Shoes");
	}

	public static void subcat() {
		Select categ2 = new Select(wait.until(ExpectedConditions.visibilityOf(subcat)));
		categ2.selectByVisibleText("Mens Shoes");
	}

	public static void uploadimage()   {

		wait.until(ExpectedConditions.elementToBeClickable(uploadimage)).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String file = "C:\\Users\\ARAVINTH\\OneDrive\\Desktop\\Project\\merge\\Merit\\Merit_Image\\purse.jpeg";

		StringSelection selection = new StringSelection(file); 

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void click() {

		wait.until(ExpectedConditions.elementToBeClickable(clicks)).click();  //*[@class='ok']
	}

	public static void stock() {
		AddProduct_Verify.stock.sendKeys("400");
	}

	public static void cost() {

		AddProduct_Verify.cost.sendKeys("1250");
	}

	public static void create() {

		wait.until(ExpectedConditions.elementToBeClickable(create)).click();
	}

	public static void close() throws Exception {

		Thread.sleep(5000);
		driver.close();
	}

}



