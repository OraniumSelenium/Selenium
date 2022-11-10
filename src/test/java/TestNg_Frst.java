import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Frst {
	@Test
	public void checkbox()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		WebElement cricketCheckbox = driver.findElement(By.id("checkbox1"));
		
		WebElement movieCheckbox = driver.findElement(By.xpath("//input[@value='Movies']"));
		
		WebElement hockeyCheckbox = driver.findElement(By.id("checkbox3"));
		
		cricketCheckbox.click();
		movieCheckbox.click();
		hockeyCheckbox.click();
		driver.close();
	}
	
	@Test
	public void radioButton()
	{

				
		WebDriverManager.chromedriver().setup();
					
        ChromeDriver driver = new ChromeDriver();
			
		
      	driver.manage().window().maximize();
			
		driver.get("https://demo.automationtesting.in/Register.html");
			
			
		
	WebElement MaleRadioButton =driver.findElement(By.xpath("//input[@value='Male']"));
	//MaleRadioButton.click();
	
	WebElement femaleRadiobutton = driver.findElement(By.cssSelector("input[value='FeMale']"));
	femaleRadiobutton.click();
	
	driver.close();
	}

}
