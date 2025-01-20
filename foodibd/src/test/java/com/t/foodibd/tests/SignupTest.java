package com.t.foodibd.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.it.foodibd.drivers.BaseDriver;
import com.it.foodibd.drivers.PageDriver;
import com.it.foodibd.pages.Login;
import com.it.foodibd.pages.SignupPage;
import com.it.foodibd.utilities.CommonMethods;

public class SignupTest extends BaseDriver {
	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		PageDriver.getCurrentDriver().get(url);
		Thread.sleep(5000);
		WebElement signUpWithMobileButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[1]"));
        signUpWithMobileButton.click(); // Example action on the button
        Thread.sleep(7000);

        // Print confirmation for locating and clicking the button
        System.out.println("Clicked on 'Sign up with mobile' button successfully.");
		}
	@Test(priority = 1)
	public void signupTestMethod() throws InterruptedException, IOException {
		
		SignupPage signupPage=new SignupPage();
		signupPage.signup();
		Thread.sleep(7000);
		}
	@Test(priority = 2)
	public void loginTestMethod() throws IOException, InterruptedException {
		
		Login login=new Login();
		login.login();
		Thread.sleep(7000);
		
	}
}
