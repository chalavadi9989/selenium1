package am.am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_moveToElement {

	public static void main(String[] args) throws InterruptedException {
		// this is MouseOver program

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/guide/action-class-in-selenium");
		
		WebElement link= driver.findElement(By.xpath("//button[@id='developers-dd-toggle']"));  
		WebElement link1= driver.findElement(By.xpath("//button[@id='products-dd-toggle']")); 
		
		//WebElement desination= driver.findElement(By.xpath("//ol[@id='bank']/li")); 
		Thread.sleep(4000);
		
		Actions  action= new Actions(driver);
		action.moveToElement(link).build().perform(); 
		action.moveToElement(link1).build().perform(); 
		
		
		driver.findElement(By.xpath("//a[@title='champions']")).click();  
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//a[@title='Test Automation']")).click();
			
	}

}
