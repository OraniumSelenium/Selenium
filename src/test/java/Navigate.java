import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {
	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver();
	    driver.navigate().to("http://google.com/");
	    
	    Thread.sleep(3000);
	     
	    driver.navigate().to("http://amazon.in/");
	    
	    Thread.sleep(2500);
	   driver.navigate().back();
	   Thread.sleep(2500);
	   driver.navigate().forward();
	    
	    
	}

}
