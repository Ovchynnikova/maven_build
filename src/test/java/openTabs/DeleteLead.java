package openTabs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wrapper.GenericWrapper;
import wrapper.ProjectSpecificWrapper;

public class DeleteLead extends ProjectSpecificWrapper {

	@Test
	public void deleteLead() throws InterruptedException{
		click(locateSelector("linktext", "Leads"));
		click(locateSelector("linktext", "Find Leads"));
		click(locateSelector("xpath", "//span[contains(text(),'Phone')]"));
		clearAndType(locateSelector("name", "phoneNumber"), "415415415");
		click(locateSelector("xpath", "//button[contains(text(),'Find Leads')]"));
		Thread.sleep(2000);
		String sText = getElementText(locateSelector("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateSelector("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		click(locateSelector("linktext", "Delete"));
		click(locateSelector("linktext", "Find Leads"));
		Thread.sleep(2000);
		clearAndType(locateSelector("xpath", "//label[contains(text(),'Lead ID:')]/following::input"), sText);
		click(locateSelector("xpath", "//button[contains(text(),'Find Leads')]"));
		verifyExactText(locateSelector("xpath", "//div[@class='x-paging-info']"), "No records to display");
	}
	

}
