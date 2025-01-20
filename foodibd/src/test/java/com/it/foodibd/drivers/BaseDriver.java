package com.it.foodibd.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//import framework.automation.drivers.PageDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	protected static String url="https://foodibd.com/auth/sign-up";
	protected WebDriver driver;
	@BeforeSuite
	public void start(){
		String browserName = System.getProperty("browser","chrome"); //checks if the browser is installed in the system or not if installed call the browser
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
		}else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}else {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		PageDriver.getInstance().setDriver(driver);
	}
	@AfterSuite
	public void close() {
		driver.quit();    //driver.close();
	}

}
