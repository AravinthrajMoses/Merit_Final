package com.merit.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base {
	
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties prop;
	public static WebDriverWait wait;
	public static Select select;

	public static void objectcreation() {

		System.setProperty("webdriver.chrome.driver", "D:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, 60);

		try {
			fis = new FileInputStream("C:\\Users\\ARAVINTH\\OneDrive\\Desktop\\Project\\merge\\Merit\\src\\main\\java\\com\\merit\\testData\\OrdersTestData.properties");
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void adminUrl() {
		driver.get(prop.getProperty("url"));
	}
	
	public static void usrurl() {
		
		driver.get(prop.getProperty("userurl"));
	}
}
