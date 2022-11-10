import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Prog2 {
	public void getText()
	{
		
		WebDriverManager.chromedriver().setup();
					
        ChromeDriver driver = new ChromeDriver();
			
		
			driver.manage().window().maximize();
			
			driver.get("https://demo.automationtesting.in/Register.html");
			
	WebElement addresslabel=		driver.findElement(By.xpath("(//label[@class='col-md-3 col-xs-3 col-sm-3 control-label'])[2]"));
	String label =addresslabel.getText();
	
	System.out.println(label);
	
	}

	
	@Test
	public void getTitle()
	{
		
		WebDriverManager.chromedriver().setup();
					
        ChromeDriver driver = new ChromeDriver();
			
			driver= new ChromeDriver();
			
		
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in/");
			
			
			/*driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
			Thread.sleep(2000);*/
			
	String getTitle = 		driver.getTitle();
	
	System.out.println(getTitle);
	}

}
