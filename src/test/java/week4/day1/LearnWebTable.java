package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {
	
	// handle the webtable and dealing with multiple element with same ref
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS", Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("SBC", Keys.TAB);
		
		// will find all the <tr> tags on the whole page 
		// List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		//// rows 
		
		// to get <tr> only from the particular table -> indicate the table
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		// System.out.println("row counts: " + rows.size());
		
		// to get a second row 
		WebElement secondRow = rows.get(1);
		
		//// columns
		
		// to get a particular column in second row -> at first we need to fetch all the columns 
		List<WebElement> columsInSecondRow = secondRow.findElements(By.tagName("td"));
		System.out.println("columns count: " + columsInSecondRow.size());
		WebElement secondCol = columsInSecondRow.get(1);
		
		System.out.println(secondCol.getText());
		
		
	}

}
