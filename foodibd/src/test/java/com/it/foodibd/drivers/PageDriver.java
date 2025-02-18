package com.it.foodibd.drivers;

import org.openqa.selenium.WebDriver;

//import framework.automation.drivers.PageDriver;

public class PageDriver {
	public static final ThreadLocal<WebDriver> webDriver= new ThreadLocal<WebDriver>();
	private static PageDriver instance=null;
	private PageDriver() {}
	public static PageDriver getInstance() {
		if (instance==null) {
			instance=new PageDriver();
		}
		return instance;
	}
    public static WebDriver getDriver() {
		return webDriver.get();
	}
	public void setDriver(WebDriver driver) {
		webDriver.set(driver);
	}
	public static WebDriver getCurrentDriver() {
		return getInstance().getDriver();
	}

}
