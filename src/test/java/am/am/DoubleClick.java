package am.am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
    driver.get("https://demo.guru99.com/test/simple_context_menu.html");
     
 WebElement link = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
 Actions action =new Actions(driver); 
 action.doubleClick(link).build().perform();
 Thread.sleep(4000); 
 
 driver.switchTo().alert().accept();
	

	}

}
