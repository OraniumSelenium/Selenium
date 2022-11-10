import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {
	
	public static void main(String Args[]) throws InterruptedException
	{
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://www.facebook.com/");
	WebElement ele=driver.findElement(By.id("email"));
	Thread.sleep(3000);
	ele.sendKeys("rsasionline@gmail.com");
	Thread.sleep(3000);
	WebElement ele1 = driver.findElement(By.name("pass"));
	ele1.sendKeys("103@MfSty");
	Thread.sleep(3000);
	WebElement ele2 = driver.findElement(By.className("_6lth"));
	ele2.click();
	Thread.sleep(9000);
	driver.close();
	}
	

}
