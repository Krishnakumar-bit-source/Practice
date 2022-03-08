package org.mind;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://Gmail.com");
		driver.manage().window().maximize();
		WebElement c = driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
		c.sendKeys("krishnakumars1995@gmail.com");
		/*Robot a=new Robot();
		//f.keyPress(KeyEvent.v);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_T);
		a.keyRelease(KeyEvent.VK_CONTROL);
		a.keyRelease(KeyEvent.VK_T);
		a.keyPress(KeyEvent.VK_CONTROL);
		a.keyPress(KeyEvent.VK_T);
		a.keyRelease(KeyEvent.VK_CONTROL);
		a.keyRelease(KeyEvent.VK_T);
		Thread.sleep(1000);
		driver.close();
		driver.close();
		driver.quit();
		WebElement b = c.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
		b.click();
		Actions z=new Actions(driver);
		z.keyDown(Keys.SHIFT).sendKeys(b,"dsjdkj").keyUp(Keys.SHIFT).perform();*/
		String attribute = c.getAttribute("value");
		System.out.println(attribute);
		WebElement findElement = driver.findElement(By.xpath("//div[contains(text(),'computer?')]"));
		String text = findElement.getText();
		System.out.println(text);
		
		driver.quit();
		

}
}