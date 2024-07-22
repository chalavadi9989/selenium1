package am.am;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_contextClick {

	public static void main(String[] args) throws InterruptedException {
		// this is Right click program 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement source= driver.findElement(By.xpath("//li[@data-id='5']/a"));
		//WebElement desination= driver.findElement(By.xpath("//ol[@id='bank']/li")); 
		Thread.sleep(4000);
		
		Actions  action= new Actions(driver);
		action.contextClick(source).build().perform();
		

	}

}
