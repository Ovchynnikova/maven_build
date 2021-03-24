package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectMultiValueDropDown {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// or use constructor
		// new ChromeDriver().get(url);
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//
		// for single drop down Products
		//
		
		WebElement prd = driver.findElement(By.xpath("//select[@id='first']"));
		
		// Select singleDropDown = new Select(prd);
		// singleDropDown.selectByIndex(2);
		
		// or use constructor if I don't need to reuse this output 
		// in some other places
		new Select(prd).selectByIndex(2);
		
		//
		// for single drop down Animals
		//
		
		// WebElement animals = driver.findElement(By.id("animals"));
		// new Select(animals).selectByVisibleText("Avatar");
		
		// or
		new Select(driver.findElement(By.id("animals"))).selectByVisibleText("Avatar");
		
		//
		// for multi drop down 
		//
		
		WebElement fItem = driver.findElement(By.xpath("//select[@id='second']"));
		Select multiDropDown = new Select(fItem);
		multiDropDown.selectByVisibleText("Donut");
		multiDropDown.selectByIndex(0);
		multiDropDown.selectByValue("burger");
		
		//Thread.sleep(2000);
		
		multiDropDown.deselectByValue("burger");
		
		WebElement fso = multiDropDown.getFirstSelectedOption();
	
		System.out.println(fso.getText());
		
		// Collection of WebElementS
		// List<WebElement> allSelectedOptions = multiDropDown.getAllSelectedOptions();
		// System.out.println(allSelectedOptions.get(0).getText());
		
		// multiDropDown.getOptions();
		
		
		
		
		
		
		
		
		
	
	}

}
