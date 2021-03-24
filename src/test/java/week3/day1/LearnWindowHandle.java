package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandle {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself')])[3]")).click();
		
		System.out.println(driver.getTitle());
		
		// switch to windows -- Window Handle
		
		// to switch to another window we need unique id for the window
		
		/// 2 ways to get this id (which is active only for the particular session)
		
		// 1.getWindowHandle --> returns current active window reference 
				// reference data type is String
		
//		String firstWindow = driver.getWindowHandle();
//		System.out.println(firstWindow);
		
		// 2.getWindowHandles --> returns all window references (ids) 
				// which are open during one particular session
				// reference data type is Set<String>
		
		Set<String> allWindows = driver.getWindowHandles();
		
		// create a List from a Set to be able to use get() function
		// 2 way to make it :
		
		// 1
//		List<String> ls = new ArrayList<String>();
//		ls.addAll(allWindows);
		
		// 2
		List<String> ls = new ArrayList<String>(allWindows);
		
		String secondWindow = ls.get(1);
		
		driver.switchTo().window(secondWindow);
		
		// or just
		// Set<String> allWindows = driver.getWindowHandles();
		// List<String> ls = new ArrayList<String>(allWindows);
		// driver.switchTo().window(ls.get(1));
		
		System.out.println(driver.getTitle());
		
		
		
		
		

		
		
		
		
		
	}

}
