package useCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	public static void main(String[] args) {
		
//		Launch the browser
//		Enter the username
//		Enter the password
//		Click Login
//		Click CRM/SFA Link
//		Click Leads Link
//		Click Find Leads
//		Enter the First Name
//		Click the Find Leads button
//		Click on First Resulting lead
//		Verify the title of the page
//		Click Edit
//		Change the Company name
//		Click Update
		
//		Confirm the Changed name appears
		
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
		
		driver.findElement(By.linkText("10185")).click();
		
		driver.getTitle().contains("View Lead | opentaps CRM");
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("aaa_ooo");
		
		driver.findElement(By.name("submitButton")).click();
		
		//WebElement companyName = driver.findElement(By.id("viewLead_companyName_sp"));
		
		
		driver.close();
	}
	

}
