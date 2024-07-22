package am.am;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyAndPaste {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.facebook.com/"); 
	    
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testing"); 
	    Actions actions =new Actions(driver); 
	    Thread.sleep(3000); 
	   // actions.keyDown(Keys.CONTROL); 
	    actions.build().perform();

	    Thread.sleep(2000);
	    actions.keyDown(Keys.TAB);
	    actions.sendKeys("a");
	    actions.keyDown(Keys.ENTER);
	   // actions.keyUp(Keys.CONTROL); 
	    actions.build().perform();
	     
	    
	    
	    

	}

}
