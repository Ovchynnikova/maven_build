package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowsers {
	
	public static void main(String[] args) {
		// Launch the browser
		
		// We need ChromeDriver.class --> to call the class
		// or function within this class we need to create 
		// the object
		
		// syntax: ClassName obj = new ClassName();
		// the ChromeDriver will be underlined, navigate on it
		// and import ChromeDriver from ChromeDriver.class
		
		// this line WebDriverManager.chromedriver().setup();
		// automatically download the driver from the Internet
		// but you just need to add dependencies WebDriverManager to pom.xml
		// and in this case I don't need folder with drivers
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// WebDriverManager.firefoxdriver().setup();
		// FirefoxDriver driver1=  new FirefoxDriver();
		
		// WebDriverManager.edgedriver().setup();
		// EdgeDriver driver2 = new EdgeDriver();
		
		// Load the URL
		driver.get("http://iarchtaps.com:8080/opentaps/control/main");
		
		//or
		driver.navigate().to("http://iarchtaps.com:8080/opentaps/control/main");
		// with this line we can use back() and forward() 
		// with get() --> WE CAN'T 
		
		
		// to open full size window
		driver.manage().window().maximize();
		// we can also minimize() and this feature available only in 4 th version
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
