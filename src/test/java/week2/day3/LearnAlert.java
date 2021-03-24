package week2.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	
	// https://chercher.tech/practice/practice-pop-ups-selenium-webdriver
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//// Scenario:
		// 1. click on alert
		driver.findElement(By.name("alert")).click();
		
		// to be able to proceed with further actions , we need to switch to alert
		// because this alert is on browser DOM, not HTML DOM
		//driver.switchTo().alert();
		
		//// with SIMPLE alert we can perform -> getText(), accept()
		
		String text2 = driver.switchTo().alert().getText();
		System.out.println(text2);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		//// with CONFIRMATION alert we can perform -> getText(), accept(), dismiss()
		driver.findElement(By.name("confirmation")).click();
		String text3 = driver.switchTo().alert().getText();
		System.out.println(text3);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		
		//// with PROMT alert  we can perform -> getText(), accept(), dismiss(), sendKeys()
		driver.findElement(By.name("prompt")).click();
		String text4 = driver.switchTo().alert().getText();
		System.out.println(text4);
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		// or we can use object alert
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(" ");
		alert.accept();
		alert.getText();
		
		
		
		// 2. get the title "Practice Alerts" 
		// and store it the variable
		String text = driver.findElement(By.className("title")).getText();
		
		// 3. check how many characters in the title "Practice Alerts"
		System.out.println(text.length());
		
		// 4. now we need the words count
		// this one will return the first word
		System.out.println(text.split(" ")[0]);
		// this one will return how many characters in this word
		System.out.println(text.split(" ")[0].length());
		
		// 5. validate the text
		
		
	
	
	}
	

}
