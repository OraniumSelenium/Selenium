import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {
public static void main(String[] args)
{
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	WebElement ele  = driver.findElement(By.name("q"));
	
	ele.sendKeys("All India Radio");
	
	if(ele.getAttribute("value").equals("All India Radio"))
		System.out.println("Matched");
	
	driver.close();
	driver.quit();
	
}
}
