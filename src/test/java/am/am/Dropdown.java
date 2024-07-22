package am.am; 
 
  
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/newtours/register.php"); 
	 
	
	Select dropdown= new Select(driver.findElement(By.xpath("//select[@name='country']"))); 
	
	//dropdown.selectByValue("INDIA"); 
	
	List<WebElement>allValues= dropdown.getOptions();
	  
	for(int i=0;i<=allValues.size()-1;i++) 
     {  
		System.out.println(allValues.get(i).getText());

	if("INDIA".equals(allValues.get(i).getText( ))) 
	    { 
		
		      dropdown.selectByValue("INDIA");
		      break;
		        }  
	    } 
     } 
	} 

	
     
 

