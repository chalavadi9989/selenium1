package am.am;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtables {
	
	
	public static WebDriver driver;
	
	
	public static void browser_launch()
	{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("http://testingmasters.weebly.com/webtables.html");
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
		driver.close();
	}

	public static void main(String[] args)
	{
	
		browser_launch();
		print_headers();
		print_Emids_Analyst();
		print_Emids_leaveslessthan5();
		browser_close();
//		Webtables.browser_launch();
//		Webtables.print_headers();
//		Webtables.print_Emids_Analyst();
//		Webtables.print_Emids_leaveslessthan5();
//		Webtables.browser_close();

	}

}

 
