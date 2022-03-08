package org.mind;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.mindtree.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class MyProject extends HelperClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		launchWebsite();
		WebElement signIn = driver.findElement(By.xpath("//a[@class='rs-nav-icon rs-nav-icon--account rs-nav-link--account rs-nav-cat-menu-item login-trigger']"));
	    moveToElement(signIn);
	    WebElement signInBtn = driver.findElement(By.xpath("//button[@class='button ds-override login-trigger']"));
	    clickBtn(signInBtn);
	    WebElement emailField = driver.findElement(By.xpath("//input[@id='email-sign-in']"));
	   /* passData("abc@gmail.com", emailField);
	    WebElement passField = driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]"));
	    passData("fjdsijfo@1", passField);
	    WebElement seeBtn = driver.findElement(By.xpath("(//button[@class='button ds-override  password-field-button js-password-field-button'])[4]"));
	    clickBtn(seeBtn);
	    TakesScreenshot t=(TakesScreenshot) driver;
	    File f1 = t.getScreenshotAs(OutputType.FILE);
	    File f=new File("C:\\Users\\surudv\\OneDrive - Capgemini\\Desktop\\New folder\\ing.pdf");
	    FileUtils.copyFile(f1, f);*/
	    JavascriptExecutor y=(JavascriptExecutor) driver;
	    y.executeScript("arguments[0].setAttribute('value','def@gmail.com')", emailField);
	    Thread.sleep(5000);
	    //closeCurrentPage();
	   closeWebsite();
	}
}
