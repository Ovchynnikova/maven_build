package useCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wrapper.GenericWrapper;

public class TC1SalesForce extends GenericWrapper {
	
	@Test
	public void registration () {
		
		invokeBrowser("chrome", "https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		
//		WebElement fName = locateElement("name", "UserFirstName");
//		enterValue(fName, "Val");
		
		// or
		//enterValue(locateElement("name", "UserFirstName"), "Val");
		
		
		//WebElement lName = locateElement("name", "UserLastName");
		//enterValue(lName, "Ovch");
		
		// or
		//enterValue(locateElement("name", "UserLastName"), "Ovch");
		
		//click(locateElement("xpath", "//div[contains(@class,'buttonCTAItemComponent')]"));
		
		
	}
	

}
