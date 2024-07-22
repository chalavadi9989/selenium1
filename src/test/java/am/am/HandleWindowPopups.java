package am.am;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowPopups {

	public static void main(String[] args) throws InterruptedException, IOException   {
	
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver=new ChromeDriver(); 
	driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
	driver.findElement(By.id("usernameField")).sendKeys("anilkumarchalavadi112@gmail.com");
	driver.findElement(By.id("passwordField")).sendKeys("seshaiah112");
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).click();		
Thread.sleep(5000); 
//driver.findElement(By.xpath("//*[@id=\"_v79t03x1fNavbar\"]/div")).click();
Thread.sleep(4000);
//driver.findElement(By.xpath("//input[@value='Update resume']")).sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Anilkumar CV-10.docx\"\"C:\\Users\\HP\\OneDrive\\Desktop\\Anilkumar CV-10.docx");
//WebElement file=driver.findElement(By.xpath("//input[@value='Update resume']"));
Thread.sleep(3000);
//file.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Anilkumar CV-10.docx"); 
driver.findElement(By.xpath("//input[@value='Update resume']")).click();
Runtime.getRuntime().exec("C:\\Users\\HP\\OneDrive\\Desktop\\fileupload.exe");
	

	}

}
