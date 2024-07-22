package am.am; 
 
//import java.util.List;  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/delete_customer.php"); 
	 
	
	driver.findElement(By.xpath("//input[@name='submit']")).click(); 
	
	//dropdown.selectByValue("INDIA"); 
	
	if(driver.switchTo().alert().getText().endsWith("Do you really want to delete this customer?"))
	{
		
	  driver.switchTo().alert().accept();
	  driver.switchTo().alert().dismiss();
	
	    } 
     } 
	} 

	
     
 

 







