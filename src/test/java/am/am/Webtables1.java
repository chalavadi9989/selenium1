 package am.am;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtables1 {
	
	
	public static WebDriver driver;
	
	
	public static void browser_launch()
	{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
	}
	
	
	public static void first_5check() throws InterruptedException 
	{ 
		Thread.sleep(4000);
		List<WebElement>Managers=driver.findElements(By.xpath("(//td[1])[position()<6]"));
		for(int i=0;i<=Managers.size();i++) 
		{ 
			Managers.get(i).click();
		} 
	}

	public static void Click_manager_checkbox()
	{
		
List<WebElement>Managers=driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[5][text()='Manager']/preceding-sibling::td/input"));
		
for(int i=0;i<=Managers.size()-1;i++)
{
	Managers.get(i).click();
}
	}

	
public static void Last_sixcheckbox()
	{
	List<WebElement>allcheckboxes =driver.findElements(By.xpath("//td[1]"));
	
	for(int i=allcheckboxes.size();i>=allcheckboxes.size()-5;i--)
	{
		
		driver.findElement(By.xpath("(//td[1])[position()="    +i+   "]"  )).click();
		
	}

	
	}
	
	public static void Rejected_ID()
	{
		
List<WebElement>Managers=driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[8]/select/option[text()='Accepted' and @selected='selected']/parent::select/parent::td/preceding-sibling::td[6]"));
		
for(int i=0;i<=Managers.size()-1;i++)
{
	System.out.println(Managers.get(i).getText());
}
	}
	
	public static void print_headers()
	{
		
List<WebElement>headers=driver.findElements(By.xpath("//table[@id='VisitingTable']/thead/tr[1]/th"));
		
for(int i=0;i<=headers.size()-1;i++)
{
	System.out.println(headers.get(i).getText());
}
	}
	
	
	public static void print_Emids_Analyst()
	{
		
List<WebElement>Anlaystids=driver.findElements(By.xpath("//table[@id='VisitingTable']/tbody/tr/td[5][text()='Analyst']/preceding-sibling::td[3]"));
		
for(int i=0;i<=Anlaystids.size()-1;i++)
{
	System.out.println(Anlaystids.get(i).getText());
}
	}
	
	
	public static void print_Emids_leaveslessthan5()
	{
		
List<WebElement>Anlaystids=driver.findElements(By.xpath("//table/tbody/tr/td[7][text()<5]/preceding-sibling::td[5]"));
		
for(int i=0;i<=Anlaystids.size()-1;i++)
{
	System.out.println(Anlaystids.get(i).getText());
}
	}
	
	 public static void browser_close()
	 {
		//driver.close();
	 }

	public static void main(String[] args) throws InterruptedException
	{
		browser_launch();
		first_5check(); 
		Click_manager_checkbox(); 
		Last_sixcheckbox(); 
		Rejected_ID(); 
		print_headers(); 
		print_Emids_Analyst(); 
		print_Emids_leaveslessthan5(); 
		browser_close();
		Thread.sleep(5000);
		//Last_sixcheckbox();
		//driver.close();
		//driver.quit();

	}

}

