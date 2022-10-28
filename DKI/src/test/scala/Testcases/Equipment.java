 package Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class Equipment {
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
	public void Equipment_Tab() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		cf.Login();
		DetailsJobPage djp=new DetailsJobPage(driver);
		//djp.searchJob();
		searchJob();
		Thread.sleep(2000);
		driver.findElement(djp.EquipmentTab).click();
		cf.myWait(5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnAddEquipment']")).click();
		Thread.sleep(3000);
		Select LevelRooms =new Select(driver.findElement(By.xpath("//select[@id='RoomID']")));
		//objmanager1.selectByVisibleText("First Floor");
		LevelRooms.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Nothing selected')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'AIR-0001 - Air Scrubber')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Checked In')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
	
System.out.println("Equipment Testcase complete");
	}
	
	
	public void searchJob() throws InterruptedException
	{
		CommonFunctions cf= new CommonFunctions(driver);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("220");
		cf.myWait(2);cf.myWait(5);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("7DK");
		cf.myWait(2);cf.myWait(5);Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='jobSearch']")).sendKeys("008");
		cf.myWait(15);
		driver.findElement(By.xpath("//div[contains(text(),'Test Satish')]")).click();
		Thread.sleep(2000);
		cf.myWait(10);
		cf.myWait(2);
	}
@AfterTest	
public void cleanup()
{
	//driver.close();
	
}


}
