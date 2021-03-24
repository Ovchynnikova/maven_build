package week1.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://iarchtaps.com:8080/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown = new Select(source);
		
		// or Select dropDown = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		
		// 1.selectByVisibleText
		// 2.selectByValue
		// 3.selectByIndex
		
		// dropDown.selectByVisibleText("Self Generated");
		// dropDown.selectByValue("LEAD_OTHER");
		dropDown.selectByIndex(2);
		
		
	}
}
