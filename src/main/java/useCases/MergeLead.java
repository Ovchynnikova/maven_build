package useCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {
	
	public static void main(String[] args) {
		
//		Launch the browser
//		Enter the username
//		Enter the password
//		Click Login
//		Click CRM/SFA Link
//		Click Leads Link	
//		Click Merge leads
		
//		Click on Icon near From Lead
//		Move to a new window
		
//		Enter Lead ID
//		Click Find Leads
//		Click First Resulting lead
//		Switch back to the primary window
//		Click on Icon near To Lead
//		Move to the new window
//		Enter Lead ID
//		Click Find Leads
//		Click First Resulting lead
		
//		Switch back to the primary window
		
//		Click Merge
//		Accept Alert
//		Click Find Leads
//		Enter From Lead ID
//		Click Find Leads
//		Verify error msg
//		Close the browser (Do not log out)
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://iarchtaps.com:8080/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Merge Leads")).click();
		
		driver.findElement(By.xpath("//img[@id='ext-gen599']")).click();
		
		driver.switchTo();
		
		driver.findElement(By.name("id")).sendKeys("10185");
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("10185")).click();
		
		driver.switchTo();
		
		driver.findElement(By.xpath("//img[@id='ext-gen629']")).click();
		
		driver.switchTo();
		
		driver.findElement(By.linkText("10189")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("10189")).click();
		
		driver.switchTo();
		
		driver.findElement(By.linkText("Merge")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.name("id")).sendKeys("10189");
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		
		
		
	}

}
