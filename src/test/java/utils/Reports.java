package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	// create object in the global level, 
	// so every method can access it
	public ExtentReports readReport;
	
	// the same for htmlReport
	public ExtentSparkReporter htmlReport;
	
	public String testCaseName, testCaseDescription, author, category;
	
	// the same for test
	public ExtentTest test, eachNode;

	// 4 steps to create report - html

	// 1. create file level
	// 2. test case level -> about a test case
	// 3. step level -> steps in each test case
	// 4. close file level
	
	
	//1//
	
	public void startReport() {

		//// 1. create file level -> @BeforeSuite ////
		// here you need to indicate where to create a report file 
		// ExtentSparkReporter -> read only 
		
		// global object
		htmlReport = new ExtentSparkReporter("./reports/report.html");

		// to modify to write/edit use ->ExtentReports
		// was like this:
		// ExtentReports readReport = new ExtentReports();
		// but when we declare the global object we don't nee
		// ExtentReports before readReports
		readReport = new ExtentReports();

		// readable file converted to the writable
		readReport.attachReporter(htmlReport);  
		////
	}

	
	//2//
	
	public void startTestCase() {
		//// 2. test case level -> about a test case -> @BeforeClass ////
		// give a name to the test and description
		
		// global object
		test = readReport.createTest(testCaseName, testCaseDescription);
		
		// and some additional info
		test.assignAuthor(author);
		test.assignCategory(category);
		eachNode = test.createNode("nodes"); // to generate separate report 
		//test.assignDevice("Win");
		////
	}
	
	
	//3//
	public void reportStep(String desc, String status) {
		//// 3. step level -> steps in each test case ////
		// generate report for the each step
		if(status.contentEquals("PASS")) {
			eachNode.pass(desc);
		}else if (status.equals("FAIL")) {
			eachNode.fail(desc);
		}
	}
		
		//test.pass("The data crmsfa entered successfully");
		//test.fail("The element login clicked successfully");
		////

	
	//4//
	
	public void stopReport() {
		//// 4. close file level -> @AfterSuite
		// flush() is mandatory 
		// it helps to exe all the above logic 
		// then it erases all the memory of this object 
		// without this last know -> nothing will happen 
		readReport.flush();
		////
	}

}








