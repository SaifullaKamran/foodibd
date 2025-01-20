package com.it.foodibd.pages;
import java.io.IOException;
import org.apache.hc.core5.http.Message;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.util.Assert;
import com.it.foodibd.drivers.PageDriver;
import com.it.foodibd.utilities.CommonMethods;

import dev.failsafe.Timeout;

public class SignupPage extends CommonMethods{
	
	public SignupPage() {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	}
	
	@FindBys({
		@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]"),
		
	})
	WebElement mobileNumber;
	@FindBys({
		@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	})
	WebElement password;
	@FindBys({
		@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	})
	WebElement confirmPassword;
	@FindBys({
		@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	})
	WebElement captcha;
	@FindBys({
		@FindBy(xpath="//body/div[5]/div[1]/div[2]/form[1]/div[1]")
	})
	WebElement signupClick;
	    // PASS CASE
		
	public void signup() throws IOException {
		
		try {
            if (mobileNumber.isDisplayed()) {
            	mobileNumber.sendKeys("01962533420");
            	
                System.out.println("Mobile number field is displayed and filled.");
                timeout(3000);
            }
        } catch (Exception e) {
            System.err.println("Mobile number field not displayed: " + e.getMessage());
        }

        try {
            if (password.isDisplayed()) {
                password.sendKeys("Saifulla1@");
                timeout(3000);
                System.out.println("Password field is displayed and filled.");
            }
        } catch (Exception e) {
            System.err.println("Password field not displayed: " + e.getMessage());
        }

        try {
            if (confirmPassword.isDisplayed()) {
            	confirmPassword.sendKeys("Saifulla1@");
            	timeout(3000);
                System.out.println("Confirm Password field is displayed and filled.");
            }
        } catch (Exception e) {
            System.err.println("Confirm Password field not displayed: " + e.getMessage());
        }

        try {
            if (captcha.isDisplayed()) {
            	timeout(3000);
            	System.out.println("Captcha checkbox is displayed.");
            }
        } catch (Exception e) {
            System.err.println("Captcha checkbox not displayed: " + e.getMessage());
        }

        try {
            if (signupClick.isDisplayed()) {
            	signupClick.click();
            	timeout(3000);
                System.out.println("Sign Up button is displayed and clicked.");
            }
        } catch (Exception e) {
            System.err.println("Sign Up button not displayed: " + e.getMessage());
        }
    }

    
}
