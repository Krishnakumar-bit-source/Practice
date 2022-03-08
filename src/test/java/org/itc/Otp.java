package org.itc;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Otp {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver a=new ChromeDriver();
	a.manage().window().maximize();
	a.get("https://www.snapdeal.com");
	WebElement b = a.findElement(By.xpath("(//input[@name='keyword'])[1]"));
	b.sendKeys("Shoes");
	WebElement c = a.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	c.click();
	WebElement d = a.findElement(By.xpath("(//p[@class='product-title '])[1]"));
	d.click();
	String parent = a.getWindowHandle();
	Set<String> child = a.getWindowHandles();
	List<String> z=new LinkedList<String>();
	z.addAll(child);
	for (int i = 0; i < z.size(); i++) {
		String childnew = z.get(i);
		if (parent!=childnew) {
			a.switchTo().window(childnew);
		}}
	   Thread.sleep(2000);
		WebElement e = a.findElement(By.xpath("//div[@class='col-xs-6 marR15 btn btn-xl btn-theme-secondary rippleWhite buyLink']"));
	e.click();
	Thread.sleep(5000);
	WebElement checkout = a.findElement(By.xpath("//a[text()='Proceed To Checkout']"));
	checkout.click();
	WebElement mobileNo = a.findElement(By.xpath("//input[@name='email']"));
	mobileNo.sendKeys("7373860518");
	WebElement contin = a.findElement(By.xpath("//button[@id='login-continue']"));
	contin.click();
	

}
}