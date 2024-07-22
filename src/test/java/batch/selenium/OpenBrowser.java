package batch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/gp/css/homepage.html"); 
	driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div/div[2]/div[2]/a/div/div/div/div[2]/h2")).click();;
	driver.findElement( By.xpath("//input[@type='email']")).sendKeys("anilkumarchalavadi112@gmail.com"); 
	
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("anilkumar@11299"); 
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	
	}

}
