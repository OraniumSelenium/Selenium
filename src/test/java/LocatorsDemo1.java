import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo1 {
	public static void main(String[] args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		for(WebElement k: ele)
		{
			System.out.println(k.getText());
			if(k.getText().equals("தமிழ்"))
			{
				k.click();
				break;
			}			
		}
		
		Thread.sleep(4000);
		//WebElement ele= driver.findElement(By.linkText("Gmail"));
		
		//WebElement ele1 = driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']"));
		
		//ele1.sendKeys("All India Radio");
       		
		
			
		
		Thread.sleep(4000);
		
		
	}

}
