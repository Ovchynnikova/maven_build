package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class With_locators {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://iarchtaps.com:8080/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//or if we need the username clear at first: we can store the element 
		// in variable and than perform multiple actions
		//WebElement elementUser = driver.findElement(By.id("username"));
		//elementUser.clear();
		//elementUser.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Monsters Inc.");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mike");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Wazowski");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mike");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Wazowski");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hi");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Manager");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HR");
		
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("455");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("private");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description example");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Note example");
		
		
		
		
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("415");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("789456123");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("888");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Mark");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("monsters@inc.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https...");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Mike");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("W");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("100 Bush st");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("103 Bush st");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("NY");
		
		//driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("NY");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("56874");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("159684");
		
		
		
		
		
	}

}
