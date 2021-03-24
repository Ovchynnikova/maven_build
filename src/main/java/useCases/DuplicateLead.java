package useCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
	public static void main(String[] args) {
		
//		Launch the browser
//		Enter the username
//		Enter the password
//		Click Login
//		Click CRM/SFA Link
//		Click Leads Link
//		Click Find Leads
//		Click on Email
//		Enter Email
//		Click the Find Leads button
//		Capture name of First Resulting lead
//		Click First Resulting lead
//		Click Duplicate Lead
//		Verify the title as 'Duplicate Lead'
//		Click Create Lead
//		Confirm the duplicated lead name isthe same as the captured name
//		Close the browser (Do not log out)
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://iarchtaps.com:8080/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.linkText("Email")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("lolo@popo.com");
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//a[@id='ext-gen922']")).getText();
		
		driver.findElement(By.linkText("10194")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		WebElement title = driver.findElement(By.id("sectionHeaderTitle_leads"));
		
		
		
		
		
		
		
		
		
	}

}
