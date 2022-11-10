import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=null;
		
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter browser name:");
		String browserSelect=obj.nextLine();
		
		switch(browserSelect)
		{
		
		case "chrome": 
		
				
		System.setProperty("webdriver.chrome.driver", "./Drivers/choromedriver.exe");	
		
		driver=new EdgeDriver();
		break;
		
		case "firefox":
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
	    driver=new EdgeDriver();
		break;
		
		case "edge":
		
        System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		
		driver=new EdgeDriver();
		break;
		
		default:
			System.out.println("You didnt select any browsers");
			break;
		}
		
		driver.get("https://www.google.com/");
		
		String chUrl=driver.getCurrentUrl();
		
		if (chUrl.equals("https://www.google.com/"))
			System.out.println(chUrl+" is Matched");
		else
			System.out.println(chUrl+" Not Matched");
		
		String chTitle=driver.getTitle();
		if (chTitle.contentEquals("Google"))
			System.out.println(chTitle+"Title is Matched");
		else
			System.out.println(chTitle+"Title Not Matched");
		Thread.sleep(5000);
		driver.close();
		
	}

}
