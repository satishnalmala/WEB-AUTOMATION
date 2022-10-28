 package Testcases;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesRepository.CommonFunctions;
import PagesRepository.DetailsJobPage;

public class Details_Job_Levels_Emergency_Service_report {
	WebDriver driver = null;
	//---------------------- Chrome Driver---------------------------
	@BeforeTest	
	public void setup()
		{
		
		//---------------------------- Chrome Driver----------
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DKI-Satish\\eclipse-workspace\\DKI\\Drivers\\ChromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			
			System.out.println("Chrome Driver started");
			
			driver.get("https://staging.dki.ca/Account/Login"); //url
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			driver.manage().window().maximize();
			/*
			//---------------------------- Edge Driver----------
			System.setProperty("webdriver.edge.driver", "C:\\Users\\DKI-Satish\\eclipse-workspace\\DKI\\Drivers\\EdgeDriver\\msedgeDriver.exe");
			driver=new EdgeDriver();
			
			System.out.println("Edge Driver started");
			driver.get("https://staging.dki.ca/Account/Login"); //url
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
			driver.manage().window().maximize();
			*/
		}
	@Test
	public void Testcase3_LevelsRooms() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		djp.searchJob();
		Thread.sleep(2000);
		driver.findElement(djp.EmergencyServiceReportTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='bigCollapsable']//div[2]//div[2]//fieldset[1]//div[1]//label[2]")).click();
		Thread.sleep(1000);
		driver.findElement(djp.EmergencyServiceReport_textarea1).sendKeys("Glass Items and property");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[4]//div[2]//fieldset[1]//div[1]//label[2]")).click();
		Thread.sleep(1000);
		driver.findElement(djp.EmergencyServiceReport_textarea2).sendKeys("No extraction required");
		driver.findElement(By.xpath("//div[6]//div[2]//fieldset[1]//div[1]//label[2]")).click();
		//driver.findElement(By.xpath("//div[5]//div[2]//textarea[1]")).sendKeys("Minimum 5 minutes");
		driver.findElement(By.xpath("//div[7]//div[2]//fieldset[1]//div[1]//label[2]")).click();
		driver.findElement(By.xpath("//div[8]//div[1]//textarea[1]")).sendKeys("Yes it was performed");
		driver.findElement(By.xpath("//div[9]//div[2]//fieldset[1]//div[1]//label[2]")).click();
		driver.findElement(By.xpath("//div[10]//div[2]//textarea[1]")).sendKeys("It was taken care with safety");
		driver.findElement(By.xpath("//div[11]//div[2]//fieldset[1]//div[1]//label[2]")).click();
		driver.findElement(By.xpath("//div[12]//div[2]//textarea[1]")).sendKeys("Safety measurements was taken");
		driver.findElement(By.xpath("//div[13]//div[2]//fieldset[1]//div[1]//label[1]")).click();
		driver.findElement(By.xpath("//div[15]//div[2]//fieldset[1]//div[1]//label[1]")).click();
		driver.findElement(By.xpath("//div[17]//div[2]//fieldset[1]//div[1]//label[2]")).click();
		driver.findElement(By.xpath("//div[18]//div[1]//textarea[1]")).sendKeys("Testing data");
		driver.findElement(By.xpath("//div[19]//div[2]//textarea[1]")).sendKeys("Testing Data");
		Thread.sleep(5000);
		
		driver.findElement(djp.EmergencyServiceReportsave).click();

	
System.out.println("Level renamed successfully");
	}
@AfterTest	
public void cleanup()
{
	//driver.close();
	
}


}
