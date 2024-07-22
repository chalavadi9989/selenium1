package am.am; 
 
import java.util.List;  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/radio.html"); 
	List<WebElement> allcheckboxes= driver.findElements(By.xpath("//input[@type='checkbox']")); 
	  
	for(int i=0;i<=allcheckboxes.size()-1;i++) 
     {

	if("checkbox2".equals(allcheckboxes.get(i).getAttribute( "value"))) 
	    { 
		Thread.sleep(4000);
	   
		        if(allcheckboxes.get(i).isSelected()) 
		           { 
		        	System.out.println("it is selected already"); 
		        	
		           } 
		        else 
		        { 
		        	allcheckboxes.get(i).click();
		        }  
	    } 
     } 
	} 
}
	
     
	
	 


            
	


