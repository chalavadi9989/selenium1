package batch.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login.php/");
        driver.findElement(By.xpath("//*[@id=\"email\"]"));
        driver.findElement(By.xpath("//*[@id=\"pass\"")).sendKeys("selenium");
    }
}
