import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLoginTest {

	public static void main(String[] args) {		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		WebElement loginclick= driver.findElement(By.xpath("//div[@class=\"layoutToolbarPadding\"]/a[2]"));
		
		loginclick.click();
		
		String Parent=driver.getWindowHandle();
		
		WebElement login=driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		login.sendKeys("rsasionline@gmail.com");
	    
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("103@MfSty");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone13");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Blue'])[1]")).click();
		Set<String> Child=driver.getWindowHandles();
		//driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		for(String c1:Child)
		{
			if(!Parent.equals(c1))
			{
				driver.switchTo().window(c1);
				System.out.print(c1);
				driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
				
							
			}
			
			
		}

	}
}
