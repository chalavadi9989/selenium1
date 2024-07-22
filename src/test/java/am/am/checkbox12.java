package am.am;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox12 {
WebDriver driver;
public void openapplication() {
	driver=new ChromeDriver();
	driver.get("https://testingmasters.weebly.com/webtables.html");
  driver.manage().window().maximize();
}
	public  void first_5check() throws InterruptedException 
	{ 

		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)", "");

		List<WebElement>Managers=driver.findElements(By.xpath("(//td[1])[position()<6]"));
		for(int i=0;i<=Managers.size()-1;i++) 
		{ 
			Managers.get(i).click();
		} 
	}
	public  void last6checkboxes() throws InterruptedException {
		// driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)", "");
		List<WebElement>allcheckboxes =driver.findElements(By.xpath("//td[1]"));
		
		for(int i=allcheckboxes.size();i>=allcheckboxes.size()-5;i--)
		{
			
			driver.findElement(By.xpath("(//td[1])[position()="    +i+   "]"  )).click();
			
		}

	}
	public static void main(String[] args) throws InterruptedException {
		checkbox12 obj=new checkbox12();
		obj.openapplication();
		obj.first_5check();
	}

}