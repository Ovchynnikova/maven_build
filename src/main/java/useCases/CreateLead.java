package useCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		
//		Launch the browser
//		Enter the username
//		Enter the password
//		Click Login
//		Click CRM/SFA link
//		Click Create Lead
//		Enter Company Name
//		Enter the First Name
//		Enter the Last Name
//		Choose Source
//		ChooseMarketing Campaign
//		Enter phone number
//		Enter email address
//		Click Create Lead
		
//		Capture the Lead ID
		
//		Close the browser (Do not log out)
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://iarchtaps.com:8080/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();

		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Monsters Inc.");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mike");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Wazowski");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown1 = new Select(source);
		dropDown1.selectByIndex(2);
		
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropDown2 = new Select(campaign);
		dropDown2.selectByValue("CATRQ_CARNDRIVER");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("41556978596");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.close();
		
	}

}
