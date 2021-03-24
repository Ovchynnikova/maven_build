package openTabs;


import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadExcel;

import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class CreateLead extends ProjectSpecificWrapper {
	
		@BeforeTest
		public void setData() {
			dataSheetName = "data";
			testCaseName = "TC001_CreateLead";
			testCaseDescription = "Create new lead for leads module";
			author = "Val";
			category = "Smoke";
		}

		// @Test(dataProvider = "getData") -> when dataProvide
		// doesn't have any attributes 
		
		@Test(dataProvider = "fetchData")
		public void createLead(String cName, String fName, String lName){
		click(locateSelector("linktext", "Leads"));
		click(locateSelector("linktext", "Create Lead"));
//		clearAndType(locateSelector("id", "createLeadForm_companyName"), cName);
//		clearAndType(locateSelector("id", "createLeadForm_firstName"), fName);
//		clearAndType(locateSelector("id", "createLeadForm_lastName"), lName);
//		selectDropDownUsingText(locateSelector("id", "createLeadForm_dataSourceId"), "Direct Mail");
//		selectDropDownUsingIndex(locateSelector("id", "createLeadForm_marketingCampaignId"), 2);
//		clearAndType(locateSelector("id", "createLeadForm_primaryEmail"), "wasowski@gmail.com");
//		clearAndType(locateSelector("id", "createLeadForm_primaryPhoneNumber"), "415415415");
//		click(locateSelector("xpath", "//input[@name='submitButton']"));
	}
	
		
		
		}


