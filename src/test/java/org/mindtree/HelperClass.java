package org.mindtree;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {
	public static WebDriver driver;
	public static void launchWebsite() {
		//System.setProperty("webdriver.chrome.driver", "C:\\eclpise\\new\\workspace\\Revision\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.navigate().to("https://www.abercrombie.com/shop/wd");
	    driver.manage().window().maximize();
       }
	public static void closeWebsite() {
	    driver.quit();
       }
	public static void passData(String a,WebElement b) {
		b.sendKeys(a);
     }
	public static void clickBtn(WebElement c) {
	  c.click();
	}
	public static void moveToElement(WebElement webref) {
		Actions d=new Actions(driver);
		d.moveToElement(webref).perform();
	}
	public static void robot() throws AWTException {
		Robot e=new Robot();
	}	
	public static void closeCurrentPage() {
		driver.close();

		}
		


}
