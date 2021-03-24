package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.findElement(By.linkText("Selectable")).click();
		
		////// switch to frame //////
		
		// 1.frame(String id or name)
			// driver.switchTo().frames("abc")
		
		// 2.frame(int index)
			// when 1-3 iframes 
			// driver.switchTo().frames(0)
			// driver.switchTo().frames(1)
		
		// 3.frame(WebElement frameEle)
			// when no id , or a lot of iframes
		WebElement ifrm = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(ifrm);
		driver.findElement(By.xpath("//li[text()='Item 1']")).click();
		
		////// come out from the frame //////
		
		driver.switchTo().defaultContent();
	
		driver.findElement(By.linkText("Themes")).click();
		driver.close();
	}

}










