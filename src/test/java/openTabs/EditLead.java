package openTabs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wrapper.GenericWrapper;
import wrapper.ProjectSpecificWrapper;


public class EditLead extends ProjectSpecificWrapper {
	
	@Test
	public void editLead() throws InterruptedException{
		click(locateSelector("linktext", "Leads"));
		click(locateSelector("linktext", "Find Leads"));
		clearAndType(locateSelector("xpath", "(//label[contains(text(),'First name:')])[3]/following::input[1]"), "Mike");
		click(locateSelector("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(5000);
		String sText = getTypedText(locateSelector("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateSelector("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		verifyTitle("View Lead | opentaps CRM");
		click(locateSelector("xpath", "//a[contains(text(),'Edit')]"));
		clearAndType(locateSelector("id", "updateLeadForm_companyName"), "Cheeseburger Inc.");
		click(locateSelector("xpath", "//input[@class='smallSubmit']"));
	}
}
