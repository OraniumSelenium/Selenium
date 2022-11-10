import java.awt.Window;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	public static void main(String[] args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.tnstc.in/home.html");
		
		//driver.findElement(By.xpath("//input[@id='matchStartPlace']")).sendKeys("Coimbatore");
		driver.findElement(By.id("matchStartPlace")).sendKeys("Coimbatore");
		driver.findElement(By.xpath("//a[@class='btnTxt']")).click();
		//driver.findElement(By.className("btnTxt"));

	    Alert alt= driver.switchTo().alert();
	    Thread.sleep(4000);
	    alt.accept();
	    
	   
	
	
	}
	
	

}
