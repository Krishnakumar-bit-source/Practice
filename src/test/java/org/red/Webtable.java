package org.red;

import java.util.List;

import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
	public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 WebDriver a=new ChromeDriver();
	 a.navigate().to("http://demo.guru99.com/test/write-xpath-table.html");
	 a.manage().window().maximize();
	 WebElement b = a.findElement(By.xpath("//table[@border='l']"));
	 List<WebElement> c = b.findElements(By.tagName("tr"));
	 int rowCount=0;
	 for (int i = 0; i < c.size(); i++) {
		rowCount++;
		WebElement row = c.get(i);
		List<WebElement> d = row.findElements(By.tagName("td"));
	int columnCount=0;
		for (int j = 0; j < d.size(); j++) {
	    columnCount++;
		WebElement column = d.get(j);
		String text = column.getText();
		if (text.equals("fourth cell")){
		System.out.println(text);
	    System.out.println("Row Count:"+rowCount);
		System.out.println("Column Count:"+columnCount);
		}
		}
		}
	   

	 
	/* System.out.println(b.getText());
	 
	 WebElement d = c.get(1);
	 List<WebElement> e = d.findElements(By.tagName("td"));
	 WebElement f = e.get(1);
	 System.out.println(f.getText());
	 Thread.sleep(2000);*/
	a.quit();
	

}
}