import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement ele =driver.findElement(By.name("q"));
		ele.sendKeys("Vellore Fort Images"+Keys.ENTER);
		TakesScreenshot tks = (TakesScreenshot)driver;
		File temp = tks.getScreenshotAs(OutputType.FILE);
		File perm=new File("./ScreenShot/vellorefort.png");
		FileUtils.copyFile(temp, perm);
		 
	}

}