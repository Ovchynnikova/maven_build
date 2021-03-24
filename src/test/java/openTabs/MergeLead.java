package openTabs;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wrapper.GenericWrapper;
import wrapper.ProjectSpecificWrapper;


public class MergeLead extends ProjectSpecificWrapper {
	
	@Test
	public void mergeLead() {
		click(locateSelector("linktext", "Leads"));
		click(locateSelector("linktext", "Merge Leads"));
		click(locateSelector("xpath", "//span[contains(text(),'From Lead')]/following::img[1]"));
		switchToWindow(1);
		String sText = getElementText(locateSelector("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateSelector("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		click(locateSelector("xpath", "//span[contains(text(),'From Lead')]/following::img[2]"));
		switchToWindow(1);
		// sText = getTypedText(locSelector("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a"));
		click(locateSelector("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a"));
		switchToWindow(0);
		click(locateSelector("linktext", "Merge"));
		acceptAlert();
		click(locateSelector("linktext", "Find Leads"));
		clearAndType(locateSelector("xpath", "//label[contains(text(),'Lead ID:')]/following::input"), sText);
		click(locateSelector("xpath", "//button[contains(text(),'Find Leads')]"));
		verifyPartialText(locateSelector("xpath", "//div[@class='x-paging-info']"), "No records to display");	
	}
}
