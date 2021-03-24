package wrapper;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificWrapper extends GenericWrapper{
	
	public String dataSheetName;
	
	@BeforeSuite
	public void beforeSuite() {
		//System.out.println("@BeforeSuite");
		startReport();
	}
	
	@BeforeClass
	public void beforeClass() {
		//System.out.println("@BeforeClass");
		startTestCase();
	}
	
	@Parameters({"browser", "uname", "pwd"})
	@BeforeMethod
	public void login(String browser, String uname, String pwd) {
		
		eachNode = test.createNode(testCaseName);
		invokeBrowser(browser, "http://iarchtaps.com:8080/opentaps/control/main");
		clearAndType(locateSelector("id","username"), uname);
		clearAndType(locateSelector("id","password"), pwd);
		click(locateSelector("class", "decorativeSubmit"));
		click(locateSelector("linktext", "CRM/SFA"));
		
	}
	
	@AfterMethod
	public void clsBrowser() {
		close();
	}
	
	@AfterSuite
	public void afterSuite() {
		stopReport();
	}
	
	@DataProvider(name = "fetchData",indices = 1)
	public String[][] getData() throws IOException {
		ReadExcel readE = new ReadExcel();
		return readE.readExcel(dataSheetName);
		

	}

}

