package org.mind;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hai {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "C:\\eclpise\\new\\workspace\\Revision\\drivers\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
    driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");
    driver.manage().window().maximize();
    WebElement a = driver.findElement(By.xpath("//table[@id='countries']"));
   // String b = a.getText();
   // System.out.println(b);
    List<WebElement> c = a.findElements(By.tagName("tr"));
    int rowCount=0; 
    for (int i = 0; i < c.size(); i++) {
    	rowCount++;
    	 WebElement d = c.get(i);
    	 List<WebElement> e = d.findElements(By.tagName("td"));
    int columnCount=0;	 
    	 for (int j = 0; j < e.size(); j++) {
    		 columnCount++;
    		 WebElement f = e.get(j);
    		 String g = f.getText();
    		 if (g.equals("English")) {
    			 System.out.println(g);
    			 System.out.println("Row Count is:"+rowCount);
    			 System.out.println("Column Count is:"+columnCount);
			}
    		 	
		}
		
	}
   

		
	
    
    
    
   
   
    driver.quit();
	//HelperClass.launchWebsite();
    // HelperClass.closeWebsi
}
}
